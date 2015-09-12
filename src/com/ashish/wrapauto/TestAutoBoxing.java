package com.ashish.wrapauto;


/**	In method overloading, boxing and unboxing can be performed. There are some rules for method overloading with boxing:
 * Widening beats boxing
 * Widening beats varargs
 * Boxing beats varargs
*/

public 
class TestAutoBoxing {

	public static void main(String... args) {
		short s1 = 18;
		short s2 = 57;
		calculate(s1, s2);
	}

	static void calculate(Short s1, Short s2) {
		System.out.println("Using Boxing ...");
	}

	static void calculate(int i, long l) {
		System.out.println("Using Widening ...");
	}

	static void calculate(int... var) {
		System.out.println("Using Variable Argument Lists ...");
	}
}