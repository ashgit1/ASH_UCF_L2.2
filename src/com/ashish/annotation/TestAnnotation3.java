package com.ashish.annotation;

/**
 * @Deprecated annotation marks that this method is deprecated so compiler prints warning. 
 * It informs user that it may be removed in the future versions. 
 * So, it is better not to use such methods.
*/

class A {
	void m() {
		System.out.println("hello m");
	}
  
@Deprecated  
	void n() {
		System.out.println("hello n");
	}
}

public class TestAnnotation3 {
	public static void main(String[] args) {
		A a=new A();  
		a.n();  
		a.m();
	}
}

/**
 * Note: Recompile with -Xlint:deprecation for details.
*/