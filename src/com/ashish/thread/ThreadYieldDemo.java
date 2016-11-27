package com.ashish.thread;

public class ThreadYieldDemo implements Runnable {

	Thread t;
	
	public ThreadYieldDemo(String str) {
		t = new Thread(this, str);
		t.start();
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			// yields control to another thread every 5 iterations
			if ((i % 5) == 0) {
				System.out.println(Thread.currentThread().getName() + " yielding control...");
				/* causes the currently executing thread object to temporarily 
				   pause and allow other threads to execute 
				 */
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName() + " has finished executing.");
	}

	public static void main(String[] args) {
		new ThreadYieldDemo("Thread 1");
		new ThreadYieldDemo("Thread 2");
		new ThreadYieldDemo("Thread 3");
	}
}
