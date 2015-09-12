package com.ashish.parsingtoken;

import java.util.regex.*;

class RegExp2 {
	public final static String PATTERN = "\\D+"; 			//"\\d+";
	public final static String INPUT_STRING = "ab438jk";

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Pattern p = Pattern.compile(PATTERN);
		Matcher m = p.matcher(INPUT_STRING);
		boolean b = false;
		while (b = m.find()) {
			System.out.print("Starts: " + m.start() + " | Ends: " + m.end() + "\n");
		}
	}
}
/**
 * \d	Matches digits. Equivalent to [0-9].
 * \D	Matches nondigits.
 * \A	Matches beginning of string.
 * \b	Matches word boundaries (cat caty[1 cat])
 * \B	Matches nonword boundaries. (cat caty[2 cat]) 
 * re*	Matches 0 or more occurrences of preceding expression.
 */
