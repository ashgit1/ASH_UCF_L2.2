package com.ashish.thread;

public class TestGarbage1 {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		TestGarbage1 s1 = new TestGarbage1();
		TestGarbage1 s2 = new TestGarbage1();
		s1 = null;
		s2 = null;
		System.gc(); 
		Runtime.getRuntime().gc();
	}
}

/** 
 * The gc() is found in System and Runtime classes.
 */