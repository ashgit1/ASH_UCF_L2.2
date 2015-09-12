package com.ashish.parsingtoken;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The matches() and lookingAt() methods both attempt to match an input sequence against a pattern. 
 * The difference, however, is that matches requires the entire input sequence to be matched, while lookingAt does not.
*/

public class RegExp4 {

	private static final String REGEX = "Ash";
	private static final String INPUT = "Ashish";
	private static Pattern pattern;
	private static Matcher matcher;

	public static void main(String args[]) {
		
		pattern = Pattern.compile(REGEX);
		matcher = pattern.matcher(INPUT);
		
		System.out.println("Current REGEX is: " + REGEX);
		System.out.println("Current INPUT is: " + INPUT);

		System.out.println("lookingAt(): " + matcher.lookingAt());
		System.out.println("matches(): " + matcher.matches());
	}
}