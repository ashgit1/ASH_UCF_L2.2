package com.ashish.syncronization;

class SharedResource {

	synchronized void printStaticTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

public class WithoutStaticSynchronization {

	public static void main(String[] args) {

		final SharedResource resource1 = new SharedResource();
		final SharedResource resource2 = new SharedResource();

		Thread t1 = new Thread() {
			public void run() {
				resource1.printStaticTable(1);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				resource1.printStaticTable(2);
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				resource2.printStaticTable(3);
			}
		};

		Thread t4 = new Thread() {
			public void run() {
				resource2.printStaticTable(4);
			}
		};

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
