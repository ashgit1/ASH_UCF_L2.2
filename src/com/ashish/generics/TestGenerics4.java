package com.ashish.generics;

/**
 * Simple example to create and use the generic method.
*/

public class TestGenerics4 {
	public static void main(String[] args) {
		Integer[] intArray		= {10,20,30,40,50};
		Character[] charArray	= {'A','B','C','D','E'};
		System.out.println("Printing Integer Array");
		printArray(intArray);
		System.out.println("Printing Character Array");
		printArray(charArray);
	}

	public static <E> void printArray(E[] arrayElements){
		for(E element : arrayElements){
			System.out.print(element + " ");
		}
		System.out.println();
	}
}