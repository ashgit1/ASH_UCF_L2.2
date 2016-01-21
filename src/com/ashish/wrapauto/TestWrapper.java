package com.ashish.wrapauto;

import org.apache.log4j.Logger;

/**
 * All the Methods Integer.ParseInt(String value), Long.ParseLong(String value) requires a String Value.
*/

public class TestWrapper {
	
	final static Logger logger = Logger.getLogger(TestWrapper.class);
	
	public static void main(String[] args) {
		Long l = new Long(167);
		long n1 = l.longValue();
		long n2 = (long) Long.parseLong("167", 8);  // base 8. --> 1*8^2 + 6*8^1 + 7*8^0 = 119
		//long n3 = Long.parseLong(167);		// error at line 6 since it expects String value.
		long n4 = Long.parseLong("167");
		
		logger.info("n1 : " + n1);
		logger.info("n2 : " + n2);
		logger.info("n3 : ");
		logger.info("n4 : " + n4);
		
	}
}