package eu.reitmayer.texttable.ui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ExecuteQueryLanguageAction extends AbstractAction {

	private MainFrame mainFrame = null;
	
	public ExecuteQueryLanguageAction(MainFrame mainFrame) {
		super(Messages.getString("ExecuteQueryLanguageAction.ActionTitle"), IconLocator.getInstance().getIcon("exec.png")); //$NON-NLS-1$ //$NON-NLS-2$
		this.mainFrame = mainFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		mainFrame.executeQueryLanguage();
	}

}
