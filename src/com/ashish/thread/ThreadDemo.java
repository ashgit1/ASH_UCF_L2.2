package com.ashish.thread;

/**
 * What is the result of compiling and executing the above code ?
 */

class DemoRun implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadGroup("Group1"), new DemoRun(), "ThreadDemo");
		thread1.start();  // returns Group1...
		thread1.run();	  // returns default "main" thread..
	}
}