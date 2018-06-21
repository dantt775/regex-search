package br.com.regex.filereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.regex.pattern.RegexSearch;

public class FileReader {

	private static final Logger LOGGER = Logger.getLogger(FileReader.class.getName());
	RegexSearch rs = new RegexSearch();
	String charSet = "UTF-8";

	
	//receive the file path and start reading the file, sending one line in each call to the linesearch method
	public void regexMatchReader(String filePath) {
		Charset charset = Charset.forName(charSet);
		Path file = Paths.get(filePath);
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				rs.lineSearch(line);
			}
		} catch (IOException e) {
			LOGGER.log(Level.INFO, "teste", e);
		}
	}

}
