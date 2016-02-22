/*package com.ashish.ivquestions;

class Odd {
	synchronized void printOdd() throws InterruptedException {
		Integer[] oddArray = { 1, 3, 5, 7, 9 };
		for (int odd : oddArray) {
			System.out.println(odd);
			notifyAll();
			wait();
		}
	}
}

class Even {
	synchronized public void printEven() throws InterruptedException {
		Integer[] evenArray = { 2, 4, 6, 8, 10 };
		for (int even : evenArray) {
			System.out.println(even);
			notifyAll();
			wait();
		}
	}
}

public class EvenOddBackUp {

	public static void main(String[] args) throws InterruptedException {

		final Odd odd = new Odd();
		final Even even = new Even();

		new Thread() {
			public void run() {
				try {
					odd.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();

		new Thread() {
			public void run() {
				try {
					even.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();

	}

}
*/