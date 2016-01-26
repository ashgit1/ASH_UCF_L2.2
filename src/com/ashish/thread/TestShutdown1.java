package com.ashish.thread;

class MyThread extends Thread {
	public void run() {
		System.out.println("Some clean up activity can be performed here");
		System.out.println("shut down hook task completed..");
	}
}

public class TestShutdown1 {
	public static void main(String[] args) throws Exception {

		Runtime r = Runtime.getRuntime();		// Returns an instance of a Class i.e factory method.
		r.addShutdownHook(new MyThread());		// Associates this thread with JVM.

		System.out.println("Now main sleeping ... press ctrl+c to exit before time runs out");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
	}
}