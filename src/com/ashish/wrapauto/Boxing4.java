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
		System.out.println("Long");
	}
	
	// Comment the below method...
	static void m(Integer I){
		System.out.println("Integer");
	}

}