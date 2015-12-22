package com.ashish.imp;

public class MyProg {

	public static void main(String[] args) {
		System.out.println("args[0] : " + args[0] );
		System.out.println("args[1] : " + args[1] );
		System.out.println("args[2] : " + args[2] );
		System.out.println("args[3] : " + args[3] );
	}
}

/**
 *  Example of command line parameter...
 *  Execute by running : java com.ashish.imp.MyProg I like Java
 *  Output: 
 *  args[0] : I
 *  args[1] : like
 *  args[2] : Java
 *  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
 *  at com.ashish.imp.MyProg.main(MyProg.java:9)
 */