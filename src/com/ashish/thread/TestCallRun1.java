package com.ashish.thread;

public class TestCallRun1 extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		TestCallRun1 t1 = new TestCallRun1();
		t1.run();		// fine, but does not start a separate call stack
		t1.start();		// This will create a seperate call stack.
	}
}
