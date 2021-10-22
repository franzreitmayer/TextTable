package eu.reitmayer.texttable.ui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class FromTableToTextAction extends AbstractAction {

	
	private MainFrame mainFrame = null;
	
	public FromTableToTextAction(MainFrame mainFrame) {
		super(Messages.getString("FromTableToTextAction.ActionTitle"), IconLocator.getInstance().getIcon("txt.png")); //$NON-NLS-1$ //$NON-NLS-2$
		this.mainFrame = mainFrame;
	}
	
	public void actionPerformed(ActionEvent e) {
		mainFrame.fromTableToText();
	}

}
