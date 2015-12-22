package com.ashish.generics;

/**
 * Simple example to create and use the generic method.
*/

public class TestGenerics4 {
	public static void main(String[] args) {
		Integer[] intArray		= {10,20,30,40,50};
		Character[] charArray	= {'A','B','C','D','E'};
		Float[] floatArray		= {10.5f, 20.5f, 30.5f, 40.5f, 50.5f};
		System.out.println("Printing Integer Array");
		printArray(intArray);
		System.out.println("Printing Character Array");
		printArray(charArray);
		System.out.println("Printing Float Array");
		printArray(floatArray);
	}

	public static <Any> void printArray(Any[] arrayElements){
		for(Any element : arrayElements){
			System.out.print(element + " ");
		}
		System.out.println();
	}
}