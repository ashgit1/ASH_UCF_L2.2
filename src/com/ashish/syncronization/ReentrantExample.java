package com.ashish.syncronization;

class Reentrant {
	public synchronized void m() {
		n();
		System.out.println("this is m() method");
	}

	public synchronized void n() {
		System.out.println("this is n() method");
	}
}

public class ReentrantExample {
	public static void main(String[] args) {

		final Reentrant re = new Reentrant();
		new Thread() {
			public void run() {
				re.m();
			}
		}.start();
	}
}