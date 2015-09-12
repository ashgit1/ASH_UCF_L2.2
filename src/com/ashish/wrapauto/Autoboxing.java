package com.ashish.wrapauto;

/**
 * The automatic conversion of primitive data types into its equivalent Wrapper
 * type is known as boxing and opposite operation is known as unboxing. This is
 * the new feature of Java5. So java programmer doesn't need to write the
 * conversion code.
 */

public class Autoboxing {
	public static void main(String args[]) {
		int a = 50;
		Integer a2 = new Integer(a);// Boxing
		Integer a3 = 5;// Boxing
		System.out.println("Boxing: " + a2 + " " + a3);
		
		Integer i=new Integer(50);  
        int b=i;  // Un boxing
        System.out.println("UnBoxing: " + b);  
	}
}