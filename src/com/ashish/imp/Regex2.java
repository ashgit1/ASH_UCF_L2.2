package com.ashish.imp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public final static String pattern = "\\d+";
	public final static String input_String = "Acknowlegde to 5 monday 20";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input_String);
		boolean b = false;
		while (b = m.find()) {
			System.out.println(m.start());

		}

	}
}
