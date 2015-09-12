package com.ashish.generics;

/**
 * Simple example to create and use the generic class.
*/

class MyGen<T>{
	T obj;	
	
	// public MyGen(){}			--> Allowed
	// public <T> MyGen(){}		--> Allowed
	// public <T> MyGen(T t){}	--> Allowed
	// public MyGen<T t>(){}	--> Not Allowed. Sytantically Wrong.
	
	void add(T object){
		this.obj = object;
	}	
	T get(){
		return obj;
	}
}

public class TestGenerics3 {
	public static void main(String[] args) {
		MyGen<String> mg = new MyGen<String>();
		mg.add("Ashish");
		System.out.println("\n Generic class with String: " + mg.get());
		
		MyGen<Integer> mg2 = new MyGen<Integer>();
		mg2.add(5);
		System.out.println("\n Generic class with Integer: " + mg2.get());
		
	}
}