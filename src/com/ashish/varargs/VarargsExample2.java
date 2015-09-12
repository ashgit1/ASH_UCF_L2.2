package com.ashish.varargs;

/**
 * Example of Varargs that is the last argument in the method:
*/	

public class VarargsExample2 {
	
	public static void display(int num, String... values) {
		System.out.println("number is " + num);
		for (String s : values) {
			System.out.println(s);
		}
		System.out.println("---------------------------------");
	}
	
	public static void main(String[] args) {
		display(1, "Ashish");
		display(2, "India", "is", "my", "country");
	}

}
