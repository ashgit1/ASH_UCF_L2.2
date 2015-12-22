package com.ashish.imp;

public class AssertTest {

	public static void main(String[] args) {

		int z=5;
		assert z > 4 : "z should be greater than 4";
		assert z > 4 : z++ ;
		System.out.println("z : " + z);
	}
}

/*
 * Assert statements should not cause side effects. 
 * Line 9 changes the value of z if the assert statement is false.
 * This is inappropriate use of assertions.
 */
