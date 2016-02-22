package com.ashish.imp;

import java.util.regex.*;

public class Regex {
	public final static String PATTERN = "\\w+";
	public final static String INPUT_STRING = "Java    is an easy language";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(PATTERN);
		Matcher m = p.matcher(INPUT_STRING);
		boolean b = false;
		while (b = m.find()) {
			System.out.print(m.group());
		}
	}
}

/*if you split at \w, then every character is a split point and the substrings between them (all empty) are returned.*/
