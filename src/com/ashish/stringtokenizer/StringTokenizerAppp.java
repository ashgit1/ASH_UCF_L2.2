package com.ashish.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerAppp {

	/**
	 * In Java, you can use StringTokennizer class to split a String into different
	 * tokens by defined delimiter.(space is the default delimiter). Uses
	 * StringTokennizer to split a string by “space” and “comma” delimiter, and
	 * iterate the StringTokenizer elements and print it out one by one.
	 */

	public static void main(String[] args) {

		String str = "This is String , split by StringTokenizer, created by Ashish.";
		StringTokenizer st = new StringTokenizer(str);

		System.out.println("-------------- Split by space(default) ---------------");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}

		StringTokenizer st2 = new StringTokenizer(str, ",");
		
		System.out.println("############# Split be Commas ################");
		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}
	}
}