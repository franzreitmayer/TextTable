package eu.reitmayer.texttable.engine;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import eu.reitmayer.texttable.lang.TextTableLexer;
import eu.reitmayer.texttable.lang.TextTableParser;

public class TextTableProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	private InputStream textTableDescritionStream;
	
	private InputStream textInputStream;
	
	public TextTableProcessor(InputStream textTableDescriptionStream,
			InputStream textInputStream) {
		this.textInputStream 			= textInputStream;
		this.textTableDescritionStream 	= textTableDescriptionStream;
	}
	
	public TextTableProcessor(String textTableDescription,
			InputStream textInputStream) {
		this.textTableDescritionStream 	= new StringBufferInputStream(textTableDescription);
		this.textInputStream 			= textInputStream;
	}
	
	public TextTableProcessor(InputStream textTableDescriptionStream,
			String textInput) {
		this.textTableDescritionStream 	= textTableDescriptionStream;
		this.textInputStream			= new StringBufferInputStream(textInput);
	}
	
	public TextTableProcessor(String textTableDescription,
			String textInput) {
		this.textTableDescritionStream	= new StringBufferInputStream(textTableDescription);
		this.textInputStream			= new StringBufferInputStream(textInput);
	}
	
	public TextTable processTextTableDescription() throws IOException, RecognitionException {
		CommonTree root = parse();
		TextTable textTable = null;
		switch (root.getToken().getType()) {
		case TextTableParser.PLAIN_FILE:
			textTable = processPlainFile(root);
			return textTable;
		}
		return null;
	}
	
	public String processTextTableDescription(TextTable textTable) throws IOException, RecognitionException {
		List<PlainItemDescription> idesc = evaluatePlainItemDescription(parse());
		TextTableExporter exporter = new TextTableExporter(textTable, idesc);
		return exporter.getText();
	}
	
	private TextTable processPlainFile(CommonTree root) {
		List<PlainItemDescription> idesc = evaluatePlainItemDescription(root);
		PlainTextImporter importer = new PlainTextImporter();
		importer.tableId = "";
		importer.itemDescriptions = idesc;
		return importer.createTextTable(textInputStream);
	}
	
	private List<PlainItemDescription> evaluatePlainItemDescription(CommonTree root) {
		List<CommonTree> elementList = ((CommonTree)root.getChild(1)).getChildren();
		List<PlainItemDescription> idesc = new ArrayList<PlainItemDescription>();
		PlainItemDescription lastItem = null;
		String[] names = new String[elementList.size()];
		for (int i=0; i<elementList.size(); i++) {
			PlainItemDescription descr = new PlainItemDescription();
			CommonTree element = elementList.get(i);
			descr.columnId = element.getText();
			names[i] = descr.columnId; 
			if (element.getChildCount() == 1 || (element.getChildCount() == 2 && element.getChild(1).getType() != TextTableParser.INT )) {
				Integer length = Integer.parseInt(element.getChild(0).getText());
				if (i == 0) {
					descr.from = 1;
					descr.to   = length;
				} else {
					descr.from = lastItem.to + 1;
					descr.to   = descr.from + length - 1;
				}
			} else {
				descr.from = Integer.parseInt(element.getChild(0).getText());
				descr.to   = Integer.parseInt(element.getChild(1).getText());
			}
			if (element.getChild(element.getChildCount() -1).getType() != TextTableParser.INT) {
				if (element.getChild(element.getChildCount() -1).getType() == TextTableParser.ALIGN_RIGHT) {
					descr.align = PlainItemDescription.align_type.right;
				}
			}
			lastItem = descr;
			idesc.add(descr);
		}
		return idesc;
	}

	private CommonTree parse() throws IOException, RecognitionException {
		ANTLRInputStream antlrInputStream = new ANTLRInputStream(textTableDescritionStream);
		TextTableLexer lexer = new TextTableLexer(antlrInputStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		TextTableParser parser = new TextTableParser(tokenStream);
		TextTableParser.table_desc_return tdesc_ret = parser.table_desc();
		return (CommonTree)tdesc_ret.getTree();
	}

}
