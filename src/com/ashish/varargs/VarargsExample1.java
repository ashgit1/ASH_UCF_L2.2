package com.ashish.varargs;


public class VarargsExample1 {
	static int counter;
	
	public static void display(String... values){
		System.out.println("Display method called: " + (++counter));
		for(String str : values){
			System.out.println(str);
		}
		System.out.println("---------------------------------------");
	}
	
	public static void main(String[] args) {	
		display();
		display("My", "Name", "is", "Ashish");
		display("India");
	}
}
