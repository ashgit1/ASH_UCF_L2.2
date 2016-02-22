package com.ashish.ivquestions;

/**
 *  This is even odd program without synchronization. Didn't get the desired result.
 */

class Odd {
	
	 void printOdd()   {
		Integer[] oddArray = { 1, 3, 5, 7, 9 };
		for (int odd : oddArray) {
			System.out.println(odd);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class Even {
	
	 public void printEven(){
		Integer[] evenArray = { 2, 4, 6, 8, 10 };
		for (int even : evenArray) {
			System.out.println(even);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class OddThread extends Thread{
	Odd odd;
	
	OddThread(Odd odd){
		this.odd = odd;
	}
	
	public void run(){
		odd.printOdd();
	}
}

class EvenThread extends Thread{
	Even even;
	
	EvenThread(Even even){
		this.even = even;
	}
	
	public void run(){
		even.printEven();
	}
}

public class EvenOdd {

	public static void main(String[] args) {
		
		Odd odd = new Odd();
		Even even = new Even();
		
		OddThread oddThread = new OddThread(odd);
		EvenThread evenThread = new EvenThread(even);
		
		oddThread.start();
		evenThread.start();
		
	}
}
