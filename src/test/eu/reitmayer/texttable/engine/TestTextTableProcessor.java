package test.eu.reitmayer.texttable.engine;


import java.io.IOException;

import org.antlr.runtime.RecognitionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.reitmayer.texttable.engine.TextTable;
import eu.reitmayer.texttable.engine.TextTableProcessor;

public class TestTextTableProcessor {

	
	private TextTableProcessor textTableProcessor;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ClassLoader cl = this.getClass().getClassLoader(); 
		textTableProcessor = new TextTableProcessor(
				cl.getResourceAsStream("test/eu/reitmayer/texttable/engine/test_text_file.texttable"), 
				cl.getResourceAsStream("test/eu/reitmayer/texttable/engine/test_text_file.txt"));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcessTextTableDescription() throws IOException, RecognitionException {
		TextTable textTable = textTableProcessor.processTextTableDescription();
	}
}
