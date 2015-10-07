package com.ashish.thread;

public class MemoryTest {
	public static void main(String args[]) throws Exception {
		
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory: " + r.totalMemory());
		System.out.println("Free Memory: " + r.freeMemory());

		for (int i = 0; i < 100000; i++) {
			new MemoryTest();
		}
		System.out.println("After creating 100000 instance, Free Memory: " + r.freeMemory());
		System.gc();
		System.out.println("After gc(), Free Memory: " + r.freeMemory());
		System.out.println("----------------------------------------------------------------");
		System.out.println("Available Processors: " + r.availableProcessors());
	}
}

/**
 * In the given program, after creating 10000 instance, free memory will be less than the previous free memory. 
 * But after gc() call, you will get more free memory.
 */