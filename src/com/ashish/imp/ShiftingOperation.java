package com.ashish.imp;

public class ShiftingOperation {

	public static void main(String[] args) {
		
		int x=7;
		System.out.println("orig x: " + x);
		x<<=2;
		System.out.println("left shift by 2 to x: " + x);
		x>>=2;
		System.out.println("right shift by 2 to x: " + x);
	}
}

/**
 * x : 	0000 0111 = (1+2+4)  : 7
 * x : 	0001 1100 = (4+8+16) : 28
 */