package com.ashish.thread;

import org.apache.log4j.Logger;

public class ThreadGroupDemo implements Runnable {
	
	final static Logger logger = Logger.getLogger(ThreadGroupDemo.class);

	public void run() {
		logger.info("Thread name : " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		ThreadGroupDemo runnable = new ThreadGroupDemo();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1, runnable, "one");
		t1.start();
		Thread t2 = new Thread(tg1, runnable, "two");
		t2.start();
		Thread t3 = new Thread(tg1, runnable, "three");
		t3.start();

		logger.info("Thread Group Name: " + tg1.getName());
		logger.info("Max priority: " + tg1.getMaxPriority());
		logger.info("Parent: " + tg1.getParent());
		logger.info("Name: " + tg1.getName());
		tg1.list();
	}
}