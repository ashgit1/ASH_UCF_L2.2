package com.ashish.generics;

/**
 *  This is the assessment example. 
 *  In the below code, which of the line is not valid and generates a compilation error ?
*/

class Gist<T extends Object> {
	T object;
	void insert(T t) {
		object = t;
	}
}
public class TestGeneric6 {
	public static void main(String... args) {
		Gist<Number> g = new Gist<Number>();
		//g.insert(new Object(12.25));   // compile time error: Since insert expects Number or any of its subclass. 
		g.insert(new Integer(10));
		g.insert(new Float(32.6f));
	}
}

/**
 * g.insert(new Double(12.25)); will work...
 */