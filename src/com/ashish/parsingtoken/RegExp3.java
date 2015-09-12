package com.ashish.parsingtoken;

import java.util.regex.*;
/**
 * Exam Question
 */
public
class RegExp3 {
	public final static String PATTERN = "\\D+";
	public final static String INPUT_STRING = "ab438jk";

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Pattern p = Pattern.compile(PATTERN);
		Matcher m = p.matcher(INPUT_STRING);
		boolean b = false;
		while (b = m.find()) {
			System.out.print(m.start());
		}
	}
}