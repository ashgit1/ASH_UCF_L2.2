package com.ashish.syncronization;

public class TestInterruptingThread3 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String args[]) {
		TestInterruptingThread3 t1 = new TestInterruptingThread3();
		t1.start();
		t1.interrupt();
		System.out.println("Thread interrupt status 1 :" + t1.isInterrupted());
		System.out.println("Thread interrupt status 2 :" + Thread.interrupted());
		System.out.println("Thread interrupt status 3 :" + t1.isInterrupted());
	}
}