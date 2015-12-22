package com.ashish.syncronization;

class TableSynBlock {

	void printTable(int n) {
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}// end of the method
}

class MyThread5 extends Thread {
	TableSynBlock t;

	MyThread5(TableSynBlock t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread6 extends Thread {
	TableSynBlock t;

	MyThread6(TableSynBlock t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class SyncronizationBlock {

	public static void main(String[] args) {
		TableSynBlock obj = new TableSynBlock();// only one object
		MyThread5 t1 = new MyThread5(obj);
		MyThread6 t2 = new MyThread6(obj);
		t1.start();
		t2.start();
	}
}
