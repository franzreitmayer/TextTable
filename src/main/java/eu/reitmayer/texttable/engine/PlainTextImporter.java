package eu.reitmayer.texttable.engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PlainTextImporter implements ITextImporter {

	public String tableId = "";
	
	private String[] columnNames = {};
	
	public List<PlainItemDescription> itemDescriptions = new ArrayList<PlainItemDescription>();

	@Override
	public TextTable createTextTable(InputStream inputStream) {
		BufferedReader br = 
			new BufferedReader(
					new InputStreamReader(inputStream));
		
		
		evaluateColumnNames();
		TextTable textTable = new TextTable(columnNames);
		String line = "";
		try {
			while (null != (line = br.readLine())) {
				int currentColumnIndex = 0;
				String[] currentRow = new String[columnNames.length];
				for (PlainItemDescription descr: itemDescriptions) {
					String currentColumnValue;
					if (descr.from - 1 > line.length() || descr.to > line.length()) {
						if (descr.from - 1 > line.length()) {
							currentColumnValue = "";
						} else {
							currentColumnValue = line.substring(descr.from-1, line.length()); 
						}
					} else {
						currentColumnValue = line.substring(descr.from-1, descr.to); 
					}
					currentRow[currentColumnIndex] = currentColumnValue.trim();
					currentColumnIndex++;
				}
				textTable.addRow(currentRow);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return textTable;
	}
	
	private void evaluateColumnNames() {
		columnNames = new String[itemDescriptions.size()];
		for (int i=0; i<itemDescriptions.size(); i++) {
			columnNames[i] = itemDescriptions.get(i).columnId;
		}
	}

}
