package test.eu.reitmayer.texttable.engine;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.reitmayer.texttable.engine.PlainItemDescription;
import eu.reitmayer.texttable.engine.PlainTextImporter;
import eu.reitmayer.texttable.engine.TextTable;

public class TextPlainTextImporter {

	private List<PlainItemDescription> itemDescr = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		itemDescr = new LinkedList<PlainItemDescription>();
		PlainItemDescription item = new PlainItemDescription();
		
		// Column 1
		item.columnId = "Column1";
		item.from     = 1;
		item.to		  = 5;
		itemDescr.add(item);
		
		// Column 2
		item = new PlainItemDescription();
		item.columnId = "Column2";
		item.from     = 6;
		item.to		  = 15;
		itemDescr.add(item);

		// Column 3
		item = new PlainItemDescription();
		item.columnId = "Column3";
		item.from     = 16;
		item.to		  = 18;
		itemDescr.add(item);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateTextTable() {
		PlainTextImporter plainTextImporter = new PlainTextImporter();
		plainTextImporter.itemDescriptions = itemDescr;
		TextTable textTable = plainTextImporter.createTextTable(
				this.getClass().getClassLoader().getResourceAsStream("test/eu/reitmayer/texttable/engine/test_text_file.txt"));
		
	}

}
