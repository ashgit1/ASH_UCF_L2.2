package com.ashish.varargs;

/**
 * What is the result of compiling and executing the above code ?
*/		
public class VarArgsTest {
	public void invoke(Float f, Float g) {
		System.out.println("Float and Float invoked");
	}

	public void invoke(Float f, float... g) {
		System.out.println("Float and variable args invoked");
	}

	public static void main(String[] args) {
		new VarArgsTest().invoke(67.3f, 27.8f);
	}
}