package com.ashish.syncronization;

public class ThreadDemo {

	static double countThread = 0;

	public static void main(String args[]) {

		while (true) {
			
			new Thread() {
				public void run() {
					try{
						countThread++;
                        System.out.println("Thread Count: " + countThread);
                        Thread.sleep(60000);
                        if(countThread==5){
                        	System.exit(0);
                        }
					}catch(InterruptedException e){
					}
					
				}
			}.start();
			
		}
	}

}
