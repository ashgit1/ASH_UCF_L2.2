package com.ashish.syncronization;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Balance : " + this.amount);
		System.out.println("going to withdraw : " + amount);

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed. Balance : " + this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit : " + amount);
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		final Customer cust = new Customer();
		
		new Thread(){
			public void run(){
				cust.withdraw(15000);
			}
		}.start();
		
		new Thread(){
			public void run(){
				cust.deposit(6000);
			}
		}.start();
	}

}
