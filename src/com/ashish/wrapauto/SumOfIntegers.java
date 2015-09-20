package com.ashish.wrapauto;

import org.apache.log4j.Logger;

public class SumOfIntegers {
	
	final static Logger logger = Logger.getLogger(SumOfIntegers.class);

	private static int sumOfIntegerUptoN(int N) {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += i;				// no UN-BOXING required.
			// The lesson is clear that prefer primitives to boxed primitives, and watch out for unintentional auto-boxing
		}
		return sum;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int sum = sumOfIntegerUptoN(1000000000);
		long end = System.currentTimeMillis();
		logger.info("Time taken in ms: " + (end - start) + " , Sum: " + sum);
	}

}
