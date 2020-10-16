package eu.reitmayer.texttable.engine;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class TextTable {

	private String[] columns;
	
	private List<String[]> data;
	
	private Hashtable<String, Integer> indexMap = new Hashtable<String, Integer>();
	
	public String[] getColumns() {
		return columns;
	}

	public void setColumns(String[] columns) {
		this.columns = columns;
		indexMap.clear();
		for (int i=0; i<this.columns.length; i++) {
			indexMap.put(this.columns[i], i);
		}
	}

	public List<String[]> getData() {
		return data;
	}

	public void setData(List<String[]> data) {
		this.data = data;
	}

	public TextTable(String[] colums) {
		setColumns(colums);
		data = new ArrayList<String[]>();
	}
	
	public void addRow(String[] row) {
		if (row == null) {
			throw new IllegalArgumentException("parameter row must not be null!");
		}
		if (row.length != getColumnCount()) {
			throw new IllegalArgumentException("row must have " + getColumnCount() + " columns!");
		}
		data.add(row);
	}
	
	public Integer getColumnCount(){
		return columns.length;
	}
	
	public Integer getColumnIndex(String columnName) {
		return indexMap.get(columnName);
	}
}
