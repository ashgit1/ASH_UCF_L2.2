package com.ashish.syncronization;

class StaticStaticTable {

	synchronized static void printStaticTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread7 extends Thread {
	public void run() {
		StaticStaticTable.printStaticTable(1);
	}
}

class MyThread8 extends Thread {
	public void run() {
		StaticStaticTable.printStaticTable(2);
	}
}

class MyThread9 extends Thread {
	public void run() {
		StaticStaticTable.printStaticTable(3);
	}
}

class MyThread10 extends Thread {
	public void run() {
		StaticStaticTable.printStaticTable(4);
	}
}

public class StaticSynchronization {
	public static void main(String t[]) {
		MyThread7 t1 = new MyThread7();
		MyThread8 t2 = new MyThread8();
		MyThread9 t3 = new MyThread9();
		MyThread10 t4 = new MyThread10();
		
		//t1.setPriority(1); t2.setPriority(2); t3.setPriority(3); t4.setPriority(4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}