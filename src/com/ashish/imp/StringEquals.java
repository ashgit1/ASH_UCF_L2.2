package com.ashish.imp;

public class StringEquals {

	public static void main(String[] args) {

		String s1 = "abc" ;
		String s2 = "abc" ;
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("abc");
		
		System.out.println(s1 == s3);
		
		
	}

}