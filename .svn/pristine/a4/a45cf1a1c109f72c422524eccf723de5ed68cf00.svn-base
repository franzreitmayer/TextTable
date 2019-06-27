package eu.reitmayer.texttable.ui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class FromTextToTableAction extends AbstractAction {

	private MainFrame mainFrame = null;
	
	public FromTextToTableAction(MainFrame mainFrame) {
		super(Messages.getString("FromTextToTableAction.ActionTitle"), IconLocator.getInstance().getIcon("spreadsheet.png")); //$NON-NLS-1$ //$NON-NLS-2$
		this.mainFrame = mainFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		mainFrame.runImport();
	}

}
