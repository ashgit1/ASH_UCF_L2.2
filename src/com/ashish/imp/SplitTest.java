package com.ashish.imp;

public class SplitTest {

	public static final String INPUT_STRING = "split 1 tested 2 now 9 ashish";

	public static void main(String[] args) {

		String[] tokens = INPUT_STRING.split("\\d");
		System.out.println("count " + tokens.length);
		for (String s : tokens) {
			System.out.print(s);
		}

	}

}
