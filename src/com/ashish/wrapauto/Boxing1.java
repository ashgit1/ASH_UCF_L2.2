package com.ashish.wrapauto;

/**
 * If there is possibility of widening and boxing, widening beats boxing.
*/

class Boxing1 {

	static void m(int i) {
		System.out.println("int");
	}

	static void m(Integer i) {
		System.out.println("Integer");
	}

	public static void main(String args[]) {
		short s = 30;
		m(s);
	}
}
