package com.ashish.wrapauto;

import org.apache.log4j.Logger;

public class UnIntentionalObjectCreation {
	
	final static Logger logger = Logger.getLogger(UnIntentionalObjectCreation.class);

	private static Integer sumOfIntegerUptoN(Integer N) {
		Integer sum = 0;
		for (Integer i = 0; i < N; i++) {
			sum += i;		// UN-BOXING happens here for all the values. Hence slow.(comp to SumOfIntegers.java)
			//Each iteration of for loop unboxes sum and i, performs addition, boxes result to sum.
		}
		return sum;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Integer sum = sumOfIntegerUptoN(100000);
		long end = System.currentTimeMillis();
		logger.info("Time taken in ms: " + (end - start) + " , Sum: " + sum);
	}

}
