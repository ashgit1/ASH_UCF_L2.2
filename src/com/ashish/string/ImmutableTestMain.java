package com.ashish.string;

import java.util.Date;

public class ImmutableTestMain {

	public static void main(String[] args) {
		ImmutableClassExample ic = ImmutableClassExample.getImmutableClassExampleObject("Ashish", 1, new Date());
		System.out.println("Before: " + ic);
		ImmutableTestMain.changeValues(ic.getVal1(),ic.getVal2(),ic.getDate());
		System.out.println("After: " + ic);
	}

	@SuppressWarnings("deprecation")
	private static void changeValues(String val1, Integer val2, Date date) {
		val1="interview";
		val2=100;
		date.setDate(20);
		System.out.println("Change: " + val1 + " --- " + val2 + " --- " + date);
	}

}
