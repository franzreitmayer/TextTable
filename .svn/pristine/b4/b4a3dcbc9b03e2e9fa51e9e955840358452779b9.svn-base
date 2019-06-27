package eu.reitmayer.texttable.lang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

public class TestTableQueryLang {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws IOException, RecognitionException {
		FileInputStream fis = new FileInputStream(args[0]);
		
		TableQueryLexer lexer = new TableQueryLexer(new ANTLRInputStream(fis));
		
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		
		TableQueryParser parser = new TableQueryParser(tokenStream);
		TableQueryParser.statement_return statement_return = parser.statement();
		CommonTree tree = (CommonTree)statement_return.getTree();
		System.out.println(tree.toStringTree());
	}

}
