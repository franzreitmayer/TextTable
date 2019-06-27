package eu.reitmayer.texttable.lang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

public class TestTextTableLang {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws IOException, RecognitionException {
		FileInputStream fis = new FileInputStream(args[0]);
		
		TextTableLexer lexer = new TextTableLexer(new ANTLRInputStream(fis));
		
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		
		TextTableParser parser = new TextTableParser(tokenStream);
		TextTableParser.table_desc_return table_desc_return = parser.table_desc();
		CommonTree tree = (CommonTree)table_desc_return.getTree();
		System.out.println(tree.toStringTree());
	}

}
