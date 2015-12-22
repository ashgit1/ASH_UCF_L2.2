package com.ashish.enums;

/**
 * Java enum example: defined inside class
*/

class EnumExample3 {
	
	enum Season {WINTER, SPRING, SUMMER, FALL;}// semicolon(;) is optional here

	public static void main(String[] args) {
		Season s = Season.SPRING;	// enum type is required to access WINTER, since they are static and final
		System.out.println(s);
	}
}