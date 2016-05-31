package com.ashish.formatter;

public class StringFormatter {

	public static void main(String args[]) {

		String s1 = "Ashish";
		String s2 = "Ashish";

		if (s1 == s2) {
			System.out.println("s1=s2 is true");
		} else {
			System.out.println("s1=s2 is false");
		}
		
		System.out.println("=================================");
		
		if (s1.equals(s2)) {
			System.out.println("s1.equals(s2) is true");
		} else {
			System.out.println("s1.equals(s2) is false");
		}
		
		System.out.println("=================================");

		String s3 = new String("Ashish");
		String s4 = new String("Ashish");

		if (s3 == s4) {
			System.out.println("s3=s4 is true");
		} else {
			System.out.println("s3=s4 is false");
		}
		
		System.out.println("=================================");

		if (s3.equals(s4)) {
			System.out.println("s3.equals(s4) is true");
		} else {
			System.out.println("s3.equals(s4) is false");
		}
	}

}
