package com.ashish.thread;

/**
 * Problem if you direct call run() method
 */

class TestCallRun2 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Thread Name: " + Thread.currentThread().getName() + " : " + i);
		}
	}

	public static void main(String args[]) {
		TestCallRun2 t1 = new TestCallRun2();
		TestCallRun2 t2 = new TestCallRun2();

		t1.run();	// Will execute the main thread in the same call stack...
		t2.run();   // Will execute the main thread in the same call stack...
	}
}

/**
 * As you can see in the above program that there is no context-switching because 
 * here t1 and t2 will be treated as normal object not thread object.
 * Context-switching : Switching of the CPU from one process or thread to another
 * maintaining state so that thread executes from the place it was left. 
 */