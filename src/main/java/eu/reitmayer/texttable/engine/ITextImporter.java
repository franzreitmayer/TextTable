package eu.reitmayer.texttable.engine;

import java.io.InputStream;

public interface ITextImporter {
	public TextTable createTextTable(InputStream inputStream);
}
