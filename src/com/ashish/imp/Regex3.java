package com.ashish.imp;

import java.util.regex.*;

public class Regex3 {

	public final static String PATTERN = "\\d+";
	public final static String INPUT_STRING = "pq63xy";

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(PATTERN);
		Matcher m = p.matcher(INPUT_STRING);

		boolean b = false;
		while (b = m.find()) {
			System.out.print(m.group());
		}
	}
}