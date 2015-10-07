package com.ashish.thread;

class TestJoinMethod1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Thread Name: " + Thread.currentThread().getName() + " : " + i);
		}
	}

	public static void main(String args[]) {
		TestJoinMethod1 t1 = new TestJoinMethod1();
		TestJoinMethod1 t2 = new TestJoinMethod1();
		TestJoinMethod1 t3 = new TestJoinMethod1();
		t1.start();
		try {
			t1.join();    // the running thread waits until t1 completes it's task.
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}

/**
 * As you can see in the above example,when t1 completes its task then t2 and t3 starts executing.
 * All the threads will wait till this thread dies i.e finishes it's execution.
 */