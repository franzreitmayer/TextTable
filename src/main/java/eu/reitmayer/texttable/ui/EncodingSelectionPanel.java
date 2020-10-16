package eu.reitmayer.texttable.ui;

import java.nio.charset.Charset;
import java.util.SortedMap;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EncodingSelectionPanel extends JPanel {

	public EncodingSelectionPanel(String encodingName) {
		super();
		this.encodingName = encodingName;
		init();
	}
	
	private JComboBox<Object> cbx;
	private String encodingName;
	
	private void init() {
		JLabel label = new JLabel("Encoding:");
		SortedMap availabelCharSets = Charset.availableCharsets();
		cbx = new JComboBox<Object>((Object[])availabelCharSets.keySet().toArray());
		cbx.setSelectedItem(encodingName);
		add(label);
		add(cbx);
	}

	public String getSelectedEncodingName() {
		encodingName = cbx.getSelectedItem().toString();
		return encodingName;
	}
	
	public void setSelectedEncodingName(String selectedEncodingName) {
		cbx.setSelectedItem(selectedEncodingName);
	}
}
