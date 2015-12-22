package com.ashish.formatter;

public class StringFormatExample {

	public static void main(String[] args) {

		int x=4;
		System.out.printf("Integer : %d\n", 15);
		System.out.printf("Floating point number with 3 decimal digits: %.3f\n", 1.21312939123);
		System.out.printf("Floating point number with 8 decimal digits: %.8f\n", 1.21312939923);
		System.out.printf("String: %s, integer: %d, float: %.6f, boolean: %b\n","Hello World", 89, 9.231435,x);
		System.out.printf("%b", x);
	}

}
