package com.ashish.thread;

public class TestSleepMethod1 extends Thread{
	
	public void run(){
		for(int i=1;i<5;i++){  
		    try{
		    	Thread.sleep(500);
		    	}catch(InterruptedException e){
		    		System.out.println(e);
		    		}  
		    System.out.println("Sleeping Thread : " + Thread.currentThread().getName()+ " : " + i);  
		  }
	}
	
	public static void main(String[] args) {
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();
		//t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}
