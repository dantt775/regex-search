package br.com.regex.main;

import br.com.regex.filereader.FileReader;

public class Main {
	public static String matches = "Results: \n";

	public static void main(String[] args) {

		//Just change the filepath to whatever you want
		String filePath = "C:\\Users\\cielo\\Desktop\\loremIpsum.txt";

		FileReader ar = new FileReader();
		ar.regexMatchReader(filePath);
		//Shitty output the found values in the file, i know i should other methods for show this to user
		//but i'm too lazy right now hahahah, hope this code help u in some kind of way
		//i did this while learning, and is cool safe some things and look after some years and realize how dumb i was.
		System.out.println(matches);

	}

}
