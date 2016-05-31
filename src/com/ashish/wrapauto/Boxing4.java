package com.ashish.wrapauto;

/**
 * Widening and Boxing can't be performed 
*/

class Boxing4 {

	public static void main(String args[]) {
		int a = 30;
		m(a);
	}
	
	static void m(Long l) {
		System.out.println("Widening and Boxing");
	}
	
	// Comment the below 2 method...
	static void m(long I){
		System.out.println("Widening");
	}
	
	static void m(Number I){
		System.out.println("Boxing and Widening");
	}

}