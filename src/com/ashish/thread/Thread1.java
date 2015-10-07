package com.ashish.thread;

public class Thread1 extends Thread{

@Override	
public void run(){
	System.out.println("\n thread is running using Thread Class");
}
	public static void main(String[] args) {
		Thread1 thread = new Thread1();    // :Read:
		thread.start();		
	}
}

/**
 * Here no need to pass reference of our class to the Thread Constructor.
 * Since our class extends Thread Class it is a Thread. 
 * Only need to invoke the run() method via start() method.
 * When you create object of Thread1 class,your class constructor is invoked(provided by Compiler) 
 * from where Thread class constructor is invoked(by super() as first statement).
 * So your Thread1 class object is thread object now.
 */