package com.ashish.thread;

public class Thread2 implements Runnable{

	public void run() {
		System.out.println("\n Running Thread using Runnable Interface : " + Thread.currentThread().getName());
		System.out.println(" Priority of " + Thread.currentThread().getName() + ": " 
										  + Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Thread2 obj = new Thread2();
		//obj.run();
		Thread t = new Thread(obj, "My Runnable Thread"); // :Read:
		t.start();
	}
}

/**
 * If you are not extending the Thread class,your class object would not be treated as a thread object.
 * So you need to explicitely create Thread class object.
 * We are passing the object of your class that implements Runnable so that your class run() method may execute.
 */