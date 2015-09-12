package com.ashish.parsingtoken;

import java.util.regex.*;
/**
 * The replaceFirst and replaceAll methods replace text that matches a given regular expression. 
 * As their names indicate, replaceFirst replaces the first occurrence, and replaceAll replaces all occurrences.
*/
public class RegExp5 {
	
	private static String REGEX = "dog";
	private static String INPUT = "The dog says meow. All dogs say meow.";
	private static String REPLACE = "cat";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		System.out.println("Original : " + INPUT);
		INPUT = m.replaceAll(REPLACE);
		System.out.println("replaceAll(): " + INPUT);
		INPUT = m.replaceFirst(REPLACE);
		System.out.println("replaceFirst(): " + INPUT);		
	}
}
