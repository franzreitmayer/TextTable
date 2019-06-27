package eu.reitmayer.texttable.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.TabSet;
import javax.swing.text.TabStop;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.BufferedTokenStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import eu.reitmayer.texttable.engine.TableQueryProcessor;
import eu.reitmayer.texttable.engine.TextTable;
import eu.reitmayer.texttable.engine.TextTableProcessor;
import eu.reitmayer.texttable.lang.TableQueryLexer;
import eu.reitmayer.texttable.lang.TableQueryParser;
import eu.reitmayer.texttable.lang.TextTableLexer;
import eu.reitmayer.texttable.lang.TextTableParser;

public class MainFrame extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);
	}

	private Logger jLog = Logger.getLogger("eu.reitmayer.texttable");
	
	private JMenuBar menuBar;
	private JMenuItem menuItemOpenFile;
	private JMenuItem menuItemSaveFile;
	private JMenuItem menuItemOpenDescriptionFile;
	private JMenuItem menuItemSaveDescriptionFile;
	private JMenuItem menuItemOpenQueryLang;
	private JMenuItem menuItemSaveQueryLang;
	private JMenuItem menuItemCloseApplication;
	private JMenu menuItemFile;
	private JMenu menuItemProcessing;
	private JMenuItem menuItemTextToTable;
	private JMenuItem menuItemTableToText;
	private JMenuItem menuItemExecSQL;
	private JMenu menuItemExport;
	private JMenuItem menuItemPushToDatabase;
	private JToolBar toolBar;

	private JTabbedPane tabbedPane;
	private JTextArea textArea;
	private JTextPane editor;
	private JScrollPane scrPaneEditor;
	private JScrollPane scrPaneQLEditor;
	private JTextPane sqlEditor;
	private JSplitPane splitPane;
	private JPanel resultPanel;
	private JTable table;
	private JTable tableTextTableErrors;
	private JTable tableTableQueryErrors;
	private EncodingSelectionPanel encodingSelectionPanel;

	private boolean plainTextDescriptionHasErrors = true;
	private boolean queryLanguageHasErrors = true;

	private SimpleAttributeSet attributeSetNormal;
	private SimpleAttributeSet attributeSetToken;
	private SimpleAttributeSet attributeSetID;
	private SimpleAttributeSet attributeSetInt;
	private SimpleAttributeSet attributeSetString;
	private SimpleAttributeSet attributeSetError;
	private SimpleAttributeSet attributeSetComment;

	private final String LAST_TEXT_FILE_OPEN_DIR = "lastTextFileOpenDir"; //$NON-NLS-1$
	private final String LAST_TEXT_FILE_SAVE_DIR = "lastTextFileSaveDir"; //$NON-NLS-1$

	private final String LAST_DESCR_FILE_OPEN_DIR = "lastDescrFileOpenDir"; //$NON-NLS-1$
	private final String LAST_DESCR_FILE_SAVE_DIR = "lastDescrFileSaveDir"; //$NON-NLS-1$

	private final String LAST_QUERY_FILE_OPEN_DIR = "lastQueryFileOpenDir"; //$NON-NLS-1$
	private final String LAST_QUERY_FILE_SAVE_DIR = "lastQueryFileSaveDir"; //$NON-NLS-1$

	private final String LAST_OPEN_ENCODING_USED = "lastOpenEncodingUsed"; //$NON-NLS-1$
	private final String LAST_SAVE_ENCODING_USED = "lastSaveEncodingUsed"; //$NON-NLS-1$

	private Properties config;
	private File configFile;

	private TextTable currentTextTable;

	public MainFrame() {
		super(Messages.getString("MainFrame.FrameCaption")); //$NON-NLS-1$
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) { //$NON-NLS-1$
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (UnsupportedLookAndFeelException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageLookAndFeelFailure"), e); //$NON-NLS-1$
		} catch (ClassNotFoundException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageLookAndFeelFailure"), e); //$NON-NLS-1$
		} catch (InstantiationException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageLookAndFeelFailure"), e); //$NON-NLS-1$
		} catch (IllegalAccessException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageLookAndFeelFailure"), e); //$NON-NLS-1$
		}
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		init();
		pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	private void init() {
		initConfiguration();
		initMenuBar();
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab(Messages.getString("MainFrame.TabTitleTextFile"), new JScrollPane( //$NON-NLS-1$
				textArea = new JTextArea()));
		JSplitPane splitPaneTextEditor = new JSplitPane(
				JSplitPane.VERTICAL_SPLIT);
		splitPaneTextEditor.add(scrPaneEditor = new JScrollPane(
				editor = new JTextPane()));
		scrPaneEditor.setBorder(BorderFactory
				.createTitledBorder(Messages.getString("MainFrame.GroupTitleStructureDescription"))); //$NON-NLS-1$
		// scrPaneEditor.setMinimumSize(new Dimension(300, 400));
		JScrollPane scrollPaneTextTableErrors = new JScrollPane(
				tableTextTableErrors = new JTable());
		scrollPaneTextTableErrors.setBorder(BorderFactory
				.createTitledBorder(Messages.getString("MainFrame.GroupTitleErrorInStructureDescription"))); //$NON-NLS-1$
		splitPaneTextEditor.add(scrollPaneTextTableErrors);
		tabbedPane.addTab(Messages.getString("MainFrame.TabTitleStructureDescription"), splitPaneTextEditor); //$NON-NLS-1$
		splitPaneTextEditor.setResizeWeight(0.99);
		splitPaneTextEditor.setDividerLocation(0.99);

		splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		splitPane.add(new JScrollPane(sqlEditor = new JTextPane()));
		sqlEditor.setBorder(BorderFactory.createTitledBorder(Messages.getString("MainFrame.GroupTitleQueryLanguage"))); //$NON-NLS-1$
		JScrollPane scrollPaneTable;
		splitPane.add(scrollPaneTable = new JScrollPane(table = new JTable()));
		scrollPaneTable.setBorder(BorderFactory
				.createTitledBorder(Messages.getString("MainFrame.GroupTitleDataTable"))); //$NON-NLS-1$
		JSplitPane splitPaneQL = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		scrPaneQLEditor = new JScrollPane(tableTableQueryErrors = new JTable());
		scrPaneQLEditor.setBorder(BorderFactory.createTitledBorder(Messages.getString("MainFrame.GroupTitleQueryLanguageErrors"))); //$NON-NLS-1$
		splitPaneQL.add(splitPane);
		splitPaneQL.add(scrPaneQLEditor);
		tabbedPane.addTab(Messages.getString("MainFrame.TabTitleTable"), splitPaneQL); //$NON-NLS-1$

		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		textArea.setFont(new Font("Courier", Font.PLAIN, 14)); //$NON-NLS-1$
		editor.setFont(new Font("Courier", Font.PLAIN, 14)); //$NON-NLS-1$
		table.setFont(new Font("Courier", Font.PLAIN, 12)); //$NON-NLS-1$
		sqlEditor.setFont(new Font("Courier", Font.PLAIN, 14)); //$NON-NLS-1$
		// %splitPane.setResizeWeight(0.5);
		splitPane.setDividerLocation(0.5);
		// splitPaneQL.setResizeWeight(0.9);
		splitPaneQL.setDividerLocation(0.9);

		encodingSelectionPanel = new EncodingSelectionPanel(Charset
				.defaultCharset().toString());
		initActions();
		initSyntaxHighlighting();

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				closeApplication();
			}
		});
	}

	private void closeApplication() {
		int ret = JOptionPane.showConfirmDialog(getContentPane(),
				Messages.getString("MainFrame.MessageToConfirmApplicationClosing"), //$NON-NLS-1$
				Messages.getString("MainFrame.ConfirmCloseTitle"), JOptionPane.YES_NO_OPTION, //$NON-NLS-1$
				JOptionPane.QUESTION_MESSAGE);
		if (ret == JOptionPane.YES_OPTION) {
			dispose();
			flushConfig();
			System.exit(0);
		}
	}

	private void initConfiguration() {
		config = new Properties();
		try {
			configFile = new File(System.getProperty("user.home") //$NON-NLS-1$
					+ "/texttable.properties"); //$NON-NLS-1$
			if (!configFile.exists()) {
				configFile.createNewFile();
			}
			config.load(new FileInputStream(configFile));
		} catch (FileNotFoundException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageReadingConfigFile"), e); //$NON-NLS-1$
		} catch (IOException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageReadingConfigFile"), e); //$NON-NLS-1$
		}
	}

	private void flushConfig() {
		try {
			config.store(new FileOutputStream(configFile),
					"Configfile written at " + new Date()); //$NON-NLS-1$
		} catch (FileNotFoundException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageWritingConfigFile"), e); //$NON-NLS-1$
		} catch (IOException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageWritingConfigFile"), e); //$NON-NLS-1$
		}
	}

	private void initSyntaxHighlighting() {

		attributeSetNormal = new SimpleAttributeSet();
		StyleConstants.setFontFamily(attributeSetNormal, "Courier"); //$NON-NLS-1$
		StyleConstants.setFontSize(attributeSetNormal, 14);
		StyleConstants.setForeground(attributeSetNormal, Color.black);

		attributeSetString = new SimpleAttributeSet(attributeSetNormal);
		StyleConstants.setForeground(attributeSetString, new Color(0x0000c0));

		attributeSetToken = new SimpleAttributeSet(attributeSetNormal);
		StyleConstants.setBold(attributeSetToken, true);
		StyleConstants.setForeground(attributeSetToken, new Color(0x7f0055));

		attributeSetID = new SimpleAttributeSet();
		StyleConstants.setForeground(attributeSetID, new Color(0x0000c0));

		attributeSetInt = new SimpleAttributeSet();
		StyleConstants.setForeground(attributeSetInt, Color.black);

		attributeSetError = new SimpleAttributeSet();
		StyleConstants.setBackground(attributeSetError, Color.red);

		attributeSetComment = new SimpleAttributeSet();
		StyleConstants.setForeground(attributeSetComment, new Color(0x3f7f5f));

		sqlEditor.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				syntaxHighlightingQuery();
			}
		});

		editor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				syntaxHighlightingDescription();
			}
		});
	}

	
	private void syntaxHighlightingQuery() {
		ANTLRStringStream antlrStringStream = new ANTLRStringStream(
				sqlEditor.getText());
		TableQueryLexer lexer = new TableQueryLexer(antlrStringStream);
		BufferedTokenStream tokenStream = new BufferedTokenStream(lexer);
		tokenStream.fill();

		List<CommonToken> tokens = tokenStream.getTokens();
		DefaultStyledDocument doc = (DefaultStyledDocument) sqlEditor
				.getDocument();
		doc.setCharacterAttributes(0, sqlEditor.getText().length(),
				attributeSetNormal, true);
		for (CommonToken token : tokens) {
			switch (token.getType()) {
			case TableQueryLexer.STRING:
				doc.setCharacterAttributes(token.getStartIndex()
						- (token.getLine() - 1), token.getText()
						.length(), attributeSetString, true);
				break;
			}

			if (token.getType() == TableQueryLexer.SELECT
					|| token.getType() == TableQueryLexer.AND
					|| token.getType() == TableQueryLexer.AS
					|| token.getType() == TableQueryLexer.OR
					|| token.getType() == TableQueryLexer.UPDATE
					|| token.getType() == TableQueryLexer.DELETE
					|| token.getType() == TableQueryLexer.FALSE
					|| token.getType() == TableQueryLexer.TRUE
					|| token.getType() == TableQueryLexer.LOWER_CASE
					|| token.getType() == TableQueryLexer.MATCHES
					|| token.getType() == TableQueryLexer.REPLACE
					|| token.getType() == TableQueryLexer.ROW_NUMBER
					|| token.getType() == TableQueryLexer.SET
					|| token.getType() == TableQueryLexer.SUB_STRING
					|| token.getType() == TableQueryLexer.UPPER_CASE
					|| token.getType() == TableQueryLexer.RANDOM_LIST
					|| token.getType() == TableQueryLexer.RANDOM_STRING
					|| token.getType() == TableQueryLexer.WHERE
					|| token.getType() == TableQueryLexer.TEXT
					|| token.getType() == TableQueryLexer.NUM
					|| token.getType() == TableQueryLexer.TEXTNUM) {
				doc.setCharacterAttributes(token.getStartIndex()
						- (token.getLine() - 1), token.getText()
						.length(), attributeSetToken, true);

			} else if (token.getType() == TableQueryLexer.ID) {
				doc.setCharacterAttributes(token.getStartIndex()
						- (token.getLine() - 1), token.getText()
						.length(), attributeSetID, true);

			} else if (token.getType() == TableQueryLexer.ML
					|| token.getType() == TableQueryLexer.SL) {
				doc.setCharacterAttributes(token.getStartIndex()
						- (token.getLine() - 1), token.getText()
						.length(), attributeSetComment, true);
			}
			antlrStringStream = new ANTLRStringStream(sqlEditor
					.getText());
			lexer = new TableQueryLexer(antlrStringStream);
			CommonTokenStream cTokenStream = new CommonTokenStream(
					lexer);
			TableQueryParser parser = new TableQueryParser(cTokenStream);

			try {
				parser.statement();
				String[] errorHeader = { Messages.getString("MainFrame.ErrorStackTableHeader") }; //$NON-NLS-1$
				List<String> errorTexts = new ArrayList<String>();
				for (RecognitionException ex : parser.errors) {
					doc.setCharacterAttributes(
							((CommonToken) ex.token).getStartIndex()
									- (ex.token == null ? 0 : ex.token
											.getLine() - 1),
							ex == null ? 3 : ex.token.getText()
									.length(), attributeSetError, true);
					errorTexts.add(ex.toString() + " - " //$NON-NLS-1$
							+ ex.token.toString());
				}
				String[][] errorData = new String[errorTexts.size()][1];
				for (int i = 0; i < errorData.length; i++) {
					String[] line = new String[1];
					line[0] = errorTexts.get(i);
					errorData[i] = line;
				}
				DefaultTableModel errorTableModel = new DefaultTableModel(
						errorData, errorHeader);
				tableTableQueryErrors.setModel(errorTableModel);
				queryLanguageHasErrors = parser.errors.size() != 0;
			} catch (RecognitionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	
	private void syntaxHighlightingDescription() {
		ANTLRStringStream antlrStringStream = new ANTLRStringStream(
				editor.getText());
		TextTableLexer lexer = new TextTableLexer(antlrStringStream);
		BufferedTokenStream tokenStream = new BufferedTokenStream(lexer);
		tokenStream.fill();
		List<CommonToken> tokens = tokenStream.getTokens();
		DefaultStyledDocument doc = (DefaultStyledDocument) editor
				.getDocument();
		doc.setCharacterAttributes(0, editor.getText().length(),
				attributeSetNormal, true);

		for (CommonToken token : tokens) {
			if (token.getType() == TextTableLexer.BEGIN
					|| token.getType() == TextTableLexer.END
					|| token.getType() == TextTableLexer.PLAIN
					|| token.getType() == TextTableLexer.SEPARATED
					|| token.getType() == TextTableLexer.BY
					|| token.getType() == TextTableLexer.TEXT_SEMICOLON
					|| token.getType() == TextTableLexer.TEXT_COMMA
					|| token.getType() == TextTableLexer.FROM
					|| token.getType() == TextTableLexer.TO
					|| token.getType() == TextTableLexer.LENGTH
					|| token.getType() == TextTableLexer.ALIGN_LEFT
					|| token.getType() == TextTableLexer.ALIGN_RIGHT) {
				doc.setCharacterAttributes(
						token.getStartIndex() - (token.getLine() - 1), token
								.getText().length(), attributeSetToken, true);
			} else if (token.getType() == TextTableLexer.INT) {
				doc.setCharacterAttributes(
						token.getStartIndex() - (token.getLine() - 1), token
								.getText().length(), attributeSetInt, true);

			} else if (token.getType() == TextTableLexer.ID) {
				doc.setCharacterAttributes(
						token.getStartIndex() - (token.getLine() - 1), token
								.getText().length(), attributeSetID, true);
			} else if (token.getType() == TextTableLexer.ML
					|| token.getType() == TextTableLexer.SL) {
				doc.setCharacterAttributes(
						token.getStartIndex() - (token.getLine() - 1), token
								.getText().length(), attributeSetComment, true);
			}
		}

		antlrStringStream = new ANTLRStringStream(editor.getText());
		lexer = new TextTableLexer(antlrStringStream);
		CommonTokenStream cTokenStream = new CommonTokenStream(lexer);
		TextTableParser parser = new TextTableParser(cTokenStream);
		try {
			parser.table_desc();
			String[] errorHeader = { Messages.getString("MainFrame.ErrorStackTableHeader") }; //$NON-NLS-1$
			List<String> errorTexts = new ArrayList<String>();
			for (RecognitionException ex : parser.errors) {
				doc.setCharacterAttributes(
						((CommonToken) ex.token).getStartIndex()
								- (ex.token == null ? 0
										: ex.token.getLine() - 1),
						ex == null ? 3 : ex.token.getText().length(),
						attributeSetError, true);
				errorTexts.add(ex.toString() + " - " + ex.token.toString()); //$NON-NLS-1$
			}
			String[][] errorData = new String[errorTexts.size()][1];
			for (int i = 0; i < errorData.length; i++) {
				String[] line = new String[1];
				line[0] = errorTexts.get(i);
				errorData[i] = line;
			}
			DefaultTableModel errorTableModel = new DefaultTableModel(
					errorData, errorHeader);
			tableTextTableErrors.setModel(errorTableModel);
			plainTextDescriptionHasErrors = parser.errors.size() != 0;
		} catch (RecognitionException e1) {
			e1.printStackTrace();
		}

	}

	private void initActions() {

		menuItemOpenFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});

		menuItemSaveFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});

		menuItemOpenDescriptionFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				openDescriptionFile();
			}

		});

		menuItemSaveDescriptionFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveDescriptionFile();
			}
		});

		menuItemOpenQueryLang.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				openQueryLanguageFile();
			}
		});

		menuItemSaveQueryLang.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveQueryLanguageFile();
			}
		});

		menuItemCloseApplication.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				closeApplication();
			}
		});

		FromTextToTableAction fromTextToTableAction = new FromTextToTableAction(
				this);

		menuItemTextToTable.setAction(fromTextToTableAction);
		menuItemTextToTable.setAccelerator(KeyStroke.getKeyStroke("F2")); //$NON-NLS-1$

		FromTableToTextAction fromTableToTextAction = new FromTableToTextAction(
				this);
		menuItemTableToText.setAction(fromTableToTextAction);
		menuItemTableToText.setAccelerator(KeyStroke.getKeyStroke("F3")); //$NON-NLS-1$

		ExecuteQueryLanguageAction executeQueryLanguageAction = new ExecuteQueryLanguageAction(
				this);

		menuItemExecSQL.setAction(executeQueryLanguageAction);
		menuItemExecSQL.setAccelerator(KeyStroke.getKeyStroke("F5")); //$NON-NLS-1$

		toolBar = new JToolBar();
		getContentPane().add(toolBar, BorderLayout.NORTH);
		toolBar.add(fromTextToTableAction);
		toolBar.add(fromTableToTextAction);
		toolBar.add(executeQueryLanguageAction);
	}

	void executeQueryLanguage() {
		if (queryLanguageHasErrors) {
			JOptionPane.showMessageDialog(getContentPane(),
					Messages.getString("MainFrame.ErrorMessageQueryLanguageContainsErrors"), //$NON-NLS-1$
					Messages.getString("MainFrame.ErrorTitleQueryLanguageContainsErrors"), JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$
		}
		if (currentTextTable == null) {
			JOptionPane.showMessageDialog(getContentPane(),
					Messages.getString("MainFrame.ErrorMessageNoDataAvailable"), Messages.getString("MainFrame.ErrorTitleNoDataAvailable"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.ERROR_MESSAGE);
		}
		try {
			TableQueryProcessor tableQueryProcessor = new TableQueryProcessor(
					sqlEditor.getText(), currentTextTable);
			TextTable resultTable = tableQueryProcessor.process();
			table.setModel(tableModelFromTextTable(resultTable));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(getContentPane(), e.getMessage(),
					Messages.getString("MainFrame.ErrorTitleErrorOnQueryExecution"), JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$
			e.printStackTrace();
		}
	}

	void fromTableToText() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		if (model == null)
			return;
		currentTextTable.getData().clear();
		for (int i = 0; i < model.getDataVector().size(); i++) {
			Vector v = (Vector) model.getDataVector().get(i);
			String[] line = (String[]) v.toArray(new String[currentTextTable
					.getColumnCount()]);
			currentTextTable.addRow(line);
		}
		TextTableProcessor processor = new TextTableProcessor(editor.getText(),
				textArea.getText());
		try {
			String text = processor
					.processTextTableDescription(currentTextTable);
			textArea.setText(text);
		} catch (IOException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageConvertingToText"), e); //$NON-NLS-1$
		} catch (RecognitionException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageConvertingToText"), e); //$NON-NLS-1$
		}
	}

	void runImport() {
		if (plainTextDescriptionHasErrors) {
			JOptionPane.showMessageDialog(getContentPane(),
					Messages.getString("MainFrame.ErrorMessageTableDescriptionContainsErrors"), //$NON-NLS-1$
					Messages.getString("MainFrame.ErrorTitleTableDescriptionContainsErrors"), JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$
			return;
		}
		TextTableProcessor processor = new TextTableProcessor(editor.getText(),
				textArea.getText());
		try {
			TextTable textTable = currentTextTable = processor
					.processTextTableDescription();
			TableModel model = tableModelFromTextTable(textTable);
			table.setModel(model);
		} catch (IOException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageConvertingToTable"), e); //$NON-NLS-1$
		} catch (RecognitionException e) {
			reportException(Messages.getString("MainFrame.ErrorMessageConvertingToTable"), e); //$NON-NLS-1$
		}

	}

	private TableModel tableModelFromTextTable(TextTable textTable) {
		Object[][] data = new Object[textTable.getData().size()][textTable
				.getColumnCount()];
		for (int i = 0; i < textTable.getData().size(); i++) {
			data[i] = textTable.getData().get(i);
		}
		DefaultTableModel model = new DefaultTableModel(data,
				textTable.getColumns());
		return model;
	}

	private void openFile() {
		String lastEncodingUsed = config.getProperty(LAST_OPEN_ENCODING_USED);
		JFileChooser fileChooser = new JFileChooser();

		if (lastEncodingUsed != null) {
			encodingSelectionPanel.setSelectedEncodingName(lastEncodingUsed);
		}
		fileChooser.setAccessory(encodingSelectionPanel);
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Textfiles (*.txt)", new String[] { "TXT" }); //$NON-NLS-1$ //$NON-NLS-2$
		fileChooser.setFileFilter(filter);
		String startDir = config.getProperty(LAST_TEXT_FILE_OPEN_DIR);
		if (startDir != null) {
			fileChooser.setSelectedFile(new File(startDir));
		}
		if (fileChooser.showOpenDialog(getContentPane()) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(
						new FileInputStream(file),
						encodingSelectionPanel.getSelectedEncodingName()));
				StringBuilder sb = new StringBuilder();
				String line;
				while (null != (line = br.readLine())) {
					sb.append(line);
					sb.append("\n"); //$NON-NLS-1$
				}
				textArea.setText(sb.toString());
				br.close();
				config.setProperty(LAST_TEXT_FILE_OPEN_DIR,
						file.getCanonicalPath());
				config.setProperty(LAST_OPEN_ENCODING_USED,
						encodingSelectionPanel.getSelectedEncodingName());
			} catch (FileNotFoundException e1) {
				reportException(Messages.getString("MainFrame.ErrorMessageOpeningTextFile"), e1); //$NON-NLS-1$
			} catch (IOException ioex) {
				reportException(Messages.getString("MainFrame.ErrorMessageOpeningTextFile"), ioex); //$NON-NLS-1$
			}
		}
	}

	private void saveFile() {
		String lastEncodingUsed = config.getProperty(LAST_SAVE_ENCODING_USED);
		JFileChooser fileChooser = new JFileChooser();

		if (lastEncodingUsed != null) {
			encodingSelectionPanel.setSelectedEncodingName(lastEncodingUsed);
		}
		fileChooser.setAccessory(encodingSelectionPanel);
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Textfiles (*.txt)", new String[] { "TXT" }); //$NON-NLS-1$ //$NON-NLS-2$
		fileChooser.setFileFilter(filter);
		String startDir = config.getProperty(LAST_TEXT_FILE_SAVE_DIR);
		if (startDir != null) {
			fileChooser.setSelectedFile(new File(startDir));
		}
		if (fileChooser.showSaveDialog(getContentPane()) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {
				file = file.getName().indexOf('.') == -1 ? new File(
						file.getCanonicalPath() + ".txt") : file; //$NON-NLS-1$
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream(file),
						encodingSelectionPanel.getSelectedEncodingName()));
				bw.write(textArea.getText());
				bw.flush();
				bw.close();
				config.setProperty(LAST_TEXT_FILE_SAVE_DIR,
						file.getCanonicalPath());
				config.setProperty(LAST_SAVE_ENCODING_USED,
						encodingSelectionPanel.getSelectedEncodingName());
			} catch (FileNotFoundException e1) {
				reportException(Messages.getString("MainFrame.ErrorMessageWritingTextFile"), e1); //$NON-NLS-1$
			} catch (IOException ioex) {
				reportException(Messages.getString("MainFrame.ErrorMessageWritingTextFile"), ioex); //$NON-NLS-1$
			}
		}
	}

	private void openDescriptionFile() {
		JFileChooser fileChooser = new JFileChooser();

		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Table description file (*.txttab)", new String[] { "TXTTAB" }); //$NON-NLS-1$ //$NON-NLS-2$
		fileChooser.setFileFilter(filter);
		String startDir = config.getProperty(LAST_DESCR_FILE_OPEN_DIR);
		if (startDir != null) {
			fileChooser.setSelectedFile(new File(startDir));
		}
		if (fileChooser.showOpenDialog(getContentPane()) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(
						new FileInputStream(file)));
				StringBuilder sb = new StringBuilder();
				String line;
				while (null != (line = br.readLine())) {
					sb.append(line);
					sb.append("\r\n"); //$NON-NLS-1$
				}
				editor.setText(sb.toString());
				br.close();
				syntaxHighlightingDescription();
				config.setProperty(LAST_DESCR_FILE_OPEN_DIR,
						file.getCanonicalPath());
			} catch (FileNotFoundException e1) {
				reportException(Messages.getString("MainFrame.ErrorMessageOpeningDescriptionFile"), e1); //$NON-NLS-1$
			} catch (IOException ioex) {
				reportException(Messages.getString("MainFrame.ErrorMessageOpeningDescriptionFile"), ioex); //$NON-NLS-1$
			}
		}
	}

	private void saveDescriptionFile() {
		JFileChooser fileChooser = new JFileChooser();

		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Table description file (*.txttab)", new String[] { "TXTTAB" }); //$NON-NLS-1$ //$NON-NLS-2$
		fileChooser.setFileFilter(filter);
		String startDir = config.getProperty(LAST_DESCR_FILE_SAVE_DIR);
		if (startDir != null) {
			fileChooser.setSelectedFile(new File(startDir));
		}
		if (fileChooser.showSaveDialog(getContentPane()) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {
				file = file.getName().indexOf('.') == -1 ? new File(
						file.getCanonicalPath() + ".txttab") : file; //$NON-NLS-1$
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream(file)));
				bw.write(editor.getText());
				bw.flush();
				bw.close();
				config.setProperty(LAST_DESCR_FILE_SAVE_DIR,
						file.getCanonicalPath());
			} catch (FileNotFoundException e1) {
				reportException(Messages.getString("MainFrame.ErrorMessageWritingDescriptionFile"), e1); //$NON-NLS-1$
			} catch (IOException ioex) {
				reportException(Messages.getString("MainFrame.ErrorMessageWritingDescriptionFile"), ioex); //$NON-NLS-1$
			}
		}

	}

	private void openQueryLanguageFile() {
		JFileChooser fileChooser = new JFileChooser();

		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Table description file (*.txtsql)", new String[] { "TXTSQL" }); //$NON-NLS-1$ //$NON-NLS-2$
		fileChooser.setFileFilter(filter);
		String startDir = config.getProperty(LAST_QUERY_FILE_OPEN_DIR);
		if (startDir != null) {
			fileChooser.setSelectedFile(new File(startDir));
		}
		if (fileChooser.showOpenDialog(getContentPane()) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(
						new FileInputStream(file)));
				StringBuilder sb = new StringBuilder();
				String line;
				while (null != (line = br.readLine())) {
					sb.append(line);
					sb.append("\r\n"); //$NON-NLS-1$
				}
				sqlEditor.setText(sb.toString());
				br.close();
				syntaxHighlightingQuery();
				config.setProperty(LAST_QUERY_FILE_OPEN_DIR,
						file.getCanonicalPath());
			} catch (FileNotFoundException e1) {
				reportException(Messages.getString("MainFrame.ErrorMessageOpeningQueryLanguageFile"), e1); //$NON-NLS-1$
			} catch (IOException ioex) {
				reportException(Messages.getString("MainFrame.ErrorMessageOpeningQueryLanguageFile"), ioex); //$NON-NLS-1$
			}
		}

	}

	private void saveQueryLanguageFile() {
		JFileChooser fileChooser = new JFileChooser();

		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Table description file (*.txtsql)", new String[] { "TXTSQL" }); //$NON-NLS-1$ //$NON-NLS-2$
		fileChooser.setFileFilter(filter);
		String startDir = config.getProperty(LAST_QUERY_FILE_SAVE_DIR);
		if (startDir != null) {
			fileChooser.setSelectedFile(new File(startDir));
		}
		if (fileChooser.showSaveDialog(getContentPane()) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {
				file = file.getName().indexOf('.') == -1 ? new File(
						file.getCanonicalPath() + ".txtsql") : file; //$NON-NLS-1$
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream(file)));
				bw.write(sqlEditor.getText());
				bw.flush();
				bw.close();
				config.setProperty(LAST_QUERY_FILE_SAVE_DIR,
						file.getCanonicalPath());
			} catch (FileNotFoundException e1) {
				reportException(Messages.getString("MainFrame.ErrorMessageWritingQueryLanguageFile"), e1); //$NON-NLS-1$
			} catch (IOException ioex) {
				reportException(Messages.getString("MainFrame.ErrorMessageWritingQueryLanguageFile"), ioex); //$NON-NLS-1$
			}
		}

	}

	private void initMenuBar() {
		menuBar = new JMenuBar();
		menuItemFile = new JMenu(Messages.getString("MainFrame.MenuItemTitleFile")); //$NON-NLS-1$

		menuItemOpenFile = new JMenuItem(Messages.getString("MainFrame.MenuItemTitleOpenTextFile")); //$NON-NLS-1$
		menuItemSaveFile = new JMenuItem(Messages.getString("MainFrame.MenuItemTitleSaveTextFile")); //$NON-NLS-1$
		menuItemOpenDescriptionFile = new JMenuItem(
				Messages.getString("MainFrame.MenuItemTitleOpenDescriptionFile")); //$NON-NLS-1$
		menuItemSaveDescriptionFile = new JMenuItem(
				Messages.getString("MainFrame.MenuItemTitleSaveDescriptionFile")); //$NON-NLS-1$
		menuItemOpenQueryLang = new JMenuItem(Messages.getString("MainFrame.MenuItemTitleOpenQueryLanguageFile")); //$NON-NLS-1$
		menuItemSaveQueryLang = new JMenuItem(Messages.getString("MainFrame.MenuItemTitleSaveQueryLanguageFile")); //$NON-NLS-1$
		menuItemCloseApplication = new JMenuItem(Messages.getString("MainFrame.MenuItemTitleCloseApplication")); //$NON-NLS-1$
		menuItemFile.add(menuItemOpenFile);
		menuItemFile.add(menuItemSaveFile);
		menuItemFile.addSeparator();
		menuItemFile.add(menuItemOpenDescriptionFile);
		menuItemFile.add(menuItemSaveDescriptionFile);
		menuItemFile.addSeparator();
		menuItemFile.add(menuItemOpenQueryLang);
		menuItemFile.add(menuItemSaveQueryLang);
		menuItemFile.addSeparator();
		menuItemFile.add(menuItemCloseApplication);

		menuItemProcessing = new JMenu(Messages.getString("MainFrame.MenuItemTitleProcessing")); //$NON-NLS-1$

		menuItemExport = new JMenu(Messages.getString("MainFrame.MenuItemTitleExport")); //$NON-NLS-1$
		menuItemPushToDatabase = new JMenuItem(Messages.getString("MainFrame.MenuItemTitlePushToDatabase")); //$NON-NLS-1$
		menuItemExport.add(menuItemPushToDatabase);
		String title = Messages.getString("MainFrame.MenuItemTitleFromTextToTable");
		menuItemTextToTable = new JMenuItem(title); //$NON-NLS-1$
		menuItemTableToText = new JMenuItem(Messages.getString("MainFrame.MenuItemTitleFromTableToText")); //$NON-NLS-1$
		menuItemExecSQL = new JMenuItem(Messages.getString("MainFrame.MenuItemTitleExecuteQuery")); //$NON-NLS-1$
		menuItemProcessing.add(menuItemTextToTable);
		menuItemProcessing.add(menuItemTableToText);
		menuItemProcessing.add(menuItemExecSQL);
		// menuItemProcessing.add(menuItemExport);

		menuBar.add(menuItemFile);
		menuBar.add(menuItemProcessing);
		setJMenuBar(menuBar);
	}

	public void setTabWidth(int charactersPerTab, JTextPane textPane) {
		FontMetrics fm = getFontMetrics(getFont());
		int charWidth = fm.charWidth('w');
		int tabWidth = charWidth * charactersPerTab;

		TabStop[] tabs = new TabStop[50];

		for (int j = 0; j < tabs.length; j++) {
			int tab = j + 1;
			tabs[j] = new TabStop(tab * tabWidth);
		}

		TabSet tabSet = new TabSet(tabs);
		SimpleAttributeSet attributes = new SimpleAttributeSet();
		StyleConstants.setTabSet(attributes, tabSet);
		int length = textPane.getDocument().getLength();
		textPane.getStyledDocument().setParagraphAttributes(0, length,
				attributes, false);
	}

	public void reportException(String message, Exception exception) {
		String errorMessage;
		StringBuilder sb = new StringBuilder();
		sb.append("<html><h3>"); //$NON-NLS-1$
		sb.append(message);
		sb.append("</h3><br>"); //$NON-NLS-1$
		if (exception != null) {
			sb.append("<h4><u>Exception Class:</u>"); //$NON-NLS-1$
			sb.append("&nbsp;"); //$NON-NLS-1$
			sb.append(exception.getClass().toString());
			sb.append("<br>"); //$NON-NLS-1$
			sb.append("<u>Exception Message:</u>"); //$NON-NLS-1$
			sb.append("&nbsp;"); //$NON-NLS-1$
			sb.append(exception.getMessage());
		}
		sb.append("</html>"); //$NON-NLS-1$

		jLog.log(Level.SEVERE, sb.toString(), exception);
		JOptionPane.showMessageDialog(getContentPane(), sb.toString(), Messages.getString("MainFrame.GenericErrorMessageTitle"), //$NON-NLS-1$
				JOptionPane.ERROR_MESSAGE);
		
	}
}
