package eu.reitmayer.texttable.engine;

import java.util.List;

public class TextTableExporter {

	private List<PlainItemDescription> itemDesc;
	private TextTable textTable;
	
	public TextTableExporter(TextTable textTable, List<PlainItemDescription> itemDesc) {
		this.textTable = textTable;
		this.itemDesc  = itemDesc;
	}
	
	public String getText() {
		String formatString = generateFormatString();
		System.out.println("format string " + formatString); 
		StringBuilder sb = new StringBuilder();
		for (String[] line_array: textTable.getData()) {
			sb.append(String.format(formatString, line_array));
			sb.append("\n");
		}
		return sb.toString();
	}

	private String generateFormatString() {
		StringBuilder sb = new StringBuilder();
		for (PlainItemDescription desc: itemDesc) {
			sb.append("%");
			if (desc.align == PlainItemDescription.align_type.left) {
				sb.append("-");
			}
			sb.append(desc.length());
			sb.append("s");
		}
		return sb.toString();
	}
}
