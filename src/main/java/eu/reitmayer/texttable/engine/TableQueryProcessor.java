package eu.reitmayer.texttable.engine;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import eu.reitmayer.texttable.lang.QueryExecutionException;
import eu.reitmayer.texttable.lang.TableQueryLexer;
import eu.reitmayer.texttable.lang.TableQueryParser;

public class TableQueryProcessor {

	private InputStream tableQueryInputStream;
	
	private TextTable sourceTable;
	
	enum ColumnType {DYNAMIC, CONST};
	
	class ColumnSpec {
		private String columnName = "";
		private String columnAlias = "";
		private String originalColumnId = "";
		private ColumnType columnType = ColumnType.DYNAMIC;
		private CommonTree columnSource = null;
	}
	
	private Hashtable<String, Integer> columnIdToIndex = null;
	
	public TableQueryProcessor(InputStream tableQueryInputStream, TextTable sourceTable) {
		this.tableQueryInputStream = tableQueryInputStream;
		this.sourceTable = sourceTable;
	}
	
	public TableQueryProcessor(String tableQueryString, TextTable sourceTable) {
		this.tableQueryInputStream = new StringBufferInputStream(tableQueryString);
		this.sourceTable = sourceTable;
	}
	
	public TextTable process() throws IOException, RecognitionException, QueryExecutionException {
		columnIdToIndex = updateColumnToIndex(sourceTable);
		CommonTree tree = parse();
		TextTable textTable = null;
		switch (tree.getToken().getType()) {
		case TableQueryParser.SELECT:
			textTable = selectStatement(tree, sourceTable);
			return textTable;
		case TableQueryParser.UPDATE:
			textTable = updateStatement(tree, sourceTable);
			return textTable;
		case TableQueryParser.DELETE:
			textTable = deleteStatement(tree, sourceTable);
			return textTable;
		}
		return textTable;
	}
	
	private TextTable deleteStatement(CommonTree tree, TextTable sourceTable) throws QueryExecutionException {
		List<String[]> rowsToBeDeleted = new LinkedList<String[]>();
		for (int i=0; i<sourceTable.getData().size(); i++) {
			String[] row = sourceTable.getData().get(i);
			if ( rowMatchesSelectCondition(row, (CommonTree)tree.getChild(0), i))
					rowsToBeDeleted.add(row);
		}
		sourceTable.getData().removeAll(rowsToBeDeleted);
		return sourceTable;
	}

	private TextTable updateStatement(CommonTree tree, TextTable sourceTable) throws QueryExecutionException {
		Integer rowNumber = 0;
		updateColumnToIndex(sourceTable);
		CommonTree updateColumnListNode = (CommonTree)tree.getChild(0);
		CommonTree selectConditionNode = (CommonTree)tree.getChild(1);
		for (String[] row: sourceTable.getData()) {
			rowNumber++;
			if (selectConditionNode != null) {
				if (! rowMatchesSelectCondition(row, selectConditionNode, rowNumber))
					continue;
			}
			for (Object o: ((CommonTree)tree.getChild(0)).getChildren()) {
				// (UPDATE_VAL_ELEM col1 (sub_string col1 1 2)) (UPDATE_VAL_ELEM col2 col3) (UPDATE_VAL_ELEM col4 "Test")
				CommonTree updateElement = (CommonTree)o;
				String idToUpdate = updateElement.getChild(0).getText();
				checkIdExistsInSourceTable(idToUpdate);
				row[columnIdToIndex.get(idToUpdate)]
						= stringExpression((CommonTree)updateElement.getChild(1), row, rowNumber);
			}
		}
		return sourceTable;
	}

	private Hashtable<String, Integer> updateColumnToIndex(TextTable textTable) {
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();
		String[] columns = textTable.getColumns();
		for (int i=0; i<columns.length; i++) {
			map.put(columns[i], i);
		}
		return map;
	}
	
	private TextTable selectStatement(CommonTree selectRoot, TextTable sourceTable) throws QueryExecutionException {
		Integer rowNumber = 0;
		ArrayList<ColumnSpec> columnList = processSelectColumnList((CommonTree)selectRoot.getChild(0));
		Hashtable<String, Integer> newIndexes = new Hashtable<String, Integer>();
		for (int i=0; i<columnList.size(); i++) {
			newIndexes.put(columnList.get(i).columnAlias, i);
		}
		CommonTree selectCond = null;
		if (selectRoot.getChildCount() >=2) {
			selectCond = (CommonTree)selectRoot.getChild(1);
		}
		String[] outputColumns = getOutputColumnNames(columnList);
		TextTable outputTextTable = new TextTable(outputColumns);
		for(String[] row: sourceTable.getData()) {
			rowNumber++;
			if (selectCond != null) {
				if (! rowMatchesSelectCondition(row, selectCond, rowNumber))
						continue;
			}
			String[] newRow = new String[outputColumns.length];
			for (ColumnSpec colSpec: columnList) {
				// when select * is used there is no source tree...
				if (colSpec.columnSource == null) {
					newRow[newIndexes.get(colSpec.columnAlias)] =
					row[sourceTable.getColumnIndex(colSpec.originalColumnId)];
				} else {
					newRow[newIndexes.get(colSpec.columnAlias)] =
						stringExpression(colSpec.columnSource, row, rowNumber);
				}
			}
			outputTextTable.addRow(newRow);
		}
		return outputTextTable;
	}
	
	private boolean rowMatchesSelectCondition(String[] row,
			CommonTree booleanExpression, Integer rowNumber) throws QueryExecutionException {
		List children;
		switch (booleanExpression.getType()) {
		case TableQueryParser.AND:
			children = booleanExpression.getChildren();
			for (Object o: children) {
				CommonTree child = (CommonTree)o;
				if (! rowMatchesSelectCondition(row, child, rowNumber)) return false;
			}
			return true;
		case TableQueryParser.OR:
			children = booleanExpression.getChildren();
			for (Object o: children) {
				CommonTree child = (CommonTree)o;
				if (rowMatchesSelectCondition(row, child, rowNumber)) return true;
			}
			return false;
		case TableQueryParser.EQUALS:
			String s = stringExpression((CommonTree)booleanExpression.getChild(0), row, rowNumber);
			String pattern = stringExpression((CommonTree)booleanExpression.getChild(1), row, rowNumber);
			return s.equals(pattern);
		case TableQueryParser.FALSE: return false;
		case TableQueryParser.MATCHES:
			s = stringExpression((CommonTree)booleanExpression.getChild(0), row, rowNumber);
			pattern = stringExpression((CommonTree)booleanExpression.getChild(1), row, rowNumber);
			if (s.matches(pattern)) return true;
			return false;
		case TableQueryParser.TRUE: return true;
		}
		return false;
	}
	
	private String stringExpression(CommonTree tree, String[] row, Integer rowNumber) throws QueryExecutionException {
		switch (tree.getType()) {
			case TableQueryParser.STRING:
				String returnString = tree.getText().replaceAll("\"", "");
				return returnString;
			case TableQueryParser.ID:
				String id = tree.getText();
				checkIdExistsInSourceTable(id);
				return row[sourceTable.getColumnIndex(id)];
			case TableQueryParser.SUB_STRING:
				return sub_string(tree, row, rowNumber);
			case TableQueryParser.CONCAT:
				return concatinate(tree, row, rowNumber);
			case TableQueryParser.LOWER_CASE:
				return lower_case(tree, row, rowNumber);
			case TableQueryParser.UPPER_CASE:
				return upper_case(tree, row, rowNumber);
			case TableQueryParser.RANDOM_STRING:
				return random_string(tree, row, rowNumber);
			case TableQueryParser.RANDOM_LIST:
				return random_list(tree, row, rowNumber);
			case TableQueryParser.REPLACE:
				return replace(tree, row, rowNumber);
			case TableQueryParser.ROW_NUMBER:
				return row_number(tree, row, rowNumber);
		}
		return "";
	}
	
	private void checkIdExistsInSourceTable(String id) throws QueryExecutionException {
		for (String columnName: sourceTable.getColumns()) {
			if (columnName.equals(id)) return;
		}
		throw new QueryExecutionException("There is no column with id " + id + " in the source table.");
	}
	
	private String upper_case(CommonTree tree, String[] row, Integer rowNumber) throws QueryExecutionException {
		return stringExpression((CommonTree)tree.getChild(0), row, rowNumber).toUpperCase();
	}

	private String row_number(CommonTree tree, String[] row, Integer rowNumber) {
		return rowNumber.toString();
	}

	private String replace(CommonTree tree, String[] row, Integer rowNumber) throws QueryExecutionException {
		return stringExpression((CommonTree)tree.getChild(0), row, rowNumber)
				.replace(
						stringExpression((CommonTree)tree.getChild(1), row, rowNumber), 
						stringExpression((CommonTree)tree.getChild(2), row, rowNumber));
	}

	private String random_string(CommonTree tree, String[] row, Integer rowNumber) {
		Random rnd = new Random();
		final String ALPHANUM = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvw";
		final String ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvw";
		final String NUM = "0123456789";
		String alphabet = "";
		Integer min = Integer.parseInt(tree.getChild(0).getText());
		Integer max = Integer.parseInt(tree.getChild(1).getText());
		Integer length = getRangeRandomNumber(min, max);
		if (tree.getChild(2).getType() == TableQueryParser.STRING) {
			alphabet = tree.getChild(2).getText().replace("\"", "");
		} else {
			String alphabetType = tree.getChild(2).getText();
			if (alphabetType.equals("TEXT")) {
				alphabet = ALPHA;
			} else if (alphabetType.equals("TEXTNUM")) {
				alphabet = ALPHANUM;
			} else if (alphabetType.equals("NUM")) {
				alphabet = NUM;
			}
		}
		   StringBuilder sb = new StringBuilder( length );
		   for( int i = 0; i < length; i++ ) 
		      sb.append( alphabet.charAt( rnd.nextInt(alphabet.length()) ) );
		   return sb.toString();
	}
	
	private int getRangeRandomNumber(int min, int max) {
		if (min > max) min = max;
		int length = 0;
		Random rnd = new Random();
		do {
			length = rnd.nextInt(max+1);
			 
		} while (length < min);
		return length;
	}

	private String random_list(CommonTree tree, String[] row, Integer rowNumber) throws QueryExecutionException {
		Random rnd = new Random();
		List<String> list = new ArrayList<String>();
		for (Object o: tree.getChildren()) {
			CommonTree childNode = (CommonTree)o;
			list.add(stringExpression(childNode, row, rowNumber));
		}
		return list.get(rnd.nextInt(list.size()));
	}

	private String lower_case(CommonTree tree, String[] row, Integer rowNumber) throws QueryExecutionException {
		return stringExpression((CommonTree)tree.getChild(0), row, rowNumber).toLowerCase();
	}

	private String concatinate(CommonTree tree, String[] row, Integer rowNumber) throws QueryExecutionException {
		return stringExpression((CommonTree)tree.getChild(0), row, rowNumber) +
				stringExpression((CommonTree)tree.getChild(1), row, rowNumber);
	}

	private String sub_string(CommonTree tree, String[] row, Integer rowNumber) throws QueryExecutionException {
		String string = stringExpression((CommonTree)tree.getChild(0), row, rowNumber);
		Integer from = Integer.parseInt(tree.getChild(1).getText());
		Integer to = Integer.parseInt(tree.getChild(2).getText());
		String sub_string = string.substring(from - 1, to);
		return sub_string;
	}

	private String[] getOutputColumnNames(List<ColumnSpec> columnList) {
		String[] outputColumns = new String[columnList.size()];
		for (int i=0; i<outputColumns.length; i++) {
			outputColumns[i] = columnList.get(i).columnAlias;
		}
		return outputColumns;
	}
	
	private ArrayList<ColumnSpec> processSelectColumnList(CommonTree columnListNode) {
		ArrayList<ColumnSpec> columnList = new ArrayList<ColumnSpec>();
		if (columnListNode.getChildCount() == 1 && columnListNode.getChild(0).getType() == TableQueryParser.ALL) {
			// ... select * ...
			for(String columnName: sourceTable.getColumns()) {
				ColumnSpec columnSpec = new ColumnSpec();
				columnSpec.columnName = columnName;
				columnSpec.originalColumnId = columnName;
				columnSpec.columnAlias = columnName;
				columnList.add(columnSpec);
			}
		} else {
			List colListNodes = columnListNode.getChildren();
			for (Object node: colListNodes) {
				CommonTree columnSpecNode = (CommonTree)node;
				ColumnSpec colSpec = new ColumnSpec();
				colSpec.columnSource = (CommonTree)columnSpecNode.getChild(0);
				int columnSpecType = columnSpecNode.getChild(0).getType();
				colSpec.columnName = columnSpecNode.getChild(0).getText();
				switch (columnSpecType) {
				case TableQueryParser.ID:
					colSpec.columnSource = (CommonTree)columnSpecNode.getChild(0);
					colSpec.originalColumnId = columnSpecNode.getChild(0).getText();
					break;
				case TableQueryParser.STRING:
					colSpec.columnSource = (CommonTree)columnSpecNode.getChild(0);
					colSpec.originalColumnId = "n/a";
					break;
				case TableQueryParser.SUB_STRING:
					colSpec.columnSource = (CommonTree)columnSpecNode.getChild(0);
					colSpec.originalColumnId = columnSpecNode.getChild(0).getChild(0).getText();
					break;
					
				}
				if (columnSpecNode.getChildCount() >= 2) {
					colSpec.columnAlias = columnSpecNode.getChild(1).getText().replace('"', ' ').trim();
				} else {
					colSpec.columnAlias = colSpec.columnName;
					if (columnSpecType != TableQueryParser.ID
							&& columnSpecType != TableQueryParser.STRING) {
						throw new RuntimeException("Built In Function must supply a column alias");
					}
				}
				columnList.add(colSpec);
			}
		}
		return columnList;
	}

	private CommonTree parse() throws IOException, RecognitionException {
		ANTLRInputStream antlrInputStream = new ANTLRInputStream(tableQueryInputStream);
		TableQueryLexer lexer = new TableQueryLexer(antlrInputStream);
		
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		
		TableQueryParser parser = new TableQueryParser(tokenStream);
		TableQueryParser.statement_return statementReturn =
				parser.statement();
		CommonTree tree = (CommonTree)statementReturn.getTree();
		return tree;
	}
	
	
}
