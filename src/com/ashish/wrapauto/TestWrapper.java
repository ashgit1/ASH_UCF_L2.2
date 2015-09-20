package com.ashish.wrapauto;

/**
 * All the Methods Integer.ParseInt(String value), Long.ParseLong(String value) requires a String Value.
*/

public class TestWrapper {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Long l = new Long(167);
		long n1 = l.longValue();
		long n2 = (long) Long.parseLong("167", 8);
		//long n3 = Long.parseLong(167);		// error at line 6 since it expects String value.
		long n4 = Long.parseLong("167");
	}
}