package com.ashish.syncronization;

class TableSyn {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread3 extends Thread {
	TableSyn t;

	MyThread3(TableSyn t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread4 extends Thread {
	TableSyn t;

	MyThread4(TableSyn t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class WithSynchronization {
	public static void main(String args[]) {
		TableSyn obj = new TableSyn();// only one object
		MyThread3 t1 = new MyThread3(obj);
		MyThread4 t2 = new MyThread4(obj);
		t1.start();
		t2.start();
	}
}