package com.ashish.thread;

class TestJoinMethod2 extends Thread {
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
		TestJoinMethod2 t1 = new TestJoinMethod2();
		TestJoinMethod2 t2 = new TestJoinMethod2();
		TestJoinMethod2 t3 = new TestJoinMethod2();
		t1.start();
		try {
			t1.join(1500);
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}

/**
 * In the above example, when t1 completes its task for 1500 milliseconds(3 times) then t2 and t3 starts executing.
 * Means it will give 1500 ms for the thread t1 to complete its task.
 * If not finished since we have done sleep(500) in run, after 1500 ms all threads will run parallel.
 */
