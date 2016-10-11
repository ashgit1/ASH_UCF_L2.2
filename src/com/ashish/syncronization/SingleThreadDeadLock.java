package com.ashish.syncronization;

class Reentrant1 {
	
	public synchronized void m() {
		System.out.println("this is m() method");
	}

	public synchronized void n() {
		m();
		System.out.println("this is n() method");
	}
}

public class SingleThreadDeadLock {

	public static void main(String[] args) {
		
		Reentrant1 re = new Reentrant1();
		
		new Thread(){
			public void run(){
				re.n();
				re.m();
			}
		}.start();
	}
}

// No deadlock as of now. Need to look in this. Single thread deadlocking