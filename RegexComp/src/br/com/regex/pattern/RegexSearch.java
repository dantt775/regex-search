package br.com.regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.regex.main.Main;

public class RegexSearch {

	// this method receive a single line, and search for the regex pattern
	// if find is true, then he add the pattern found into matches var
	public void lineSearch(String line) {
		String pattern = "('+[0-9]+ -)";// pattern to be find
		Pattern checkRegex = Pattern.compile(pattern);
		Matcher regexMatcher = checkRegex.matcher(line);
		if (regexMatcher.find())
			Main.matches += regexMatcher.group(0) + "\n";

	}

}
