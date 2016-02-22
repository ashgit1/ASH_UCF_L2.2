package com.ashish.imp;

import static java.lang.System.*;

public class Boxing {

	public static void main(String[] args) {

		int i1 = 21;
		int i2 = 22;
		process(i1, i2);
	}

	static void process(long i, long j) {
		out.println("widening invoked");

	}

	static void process(int... v) {
		out.format("var agrs invoked");
	}

	static void process(Integer i1, Integer i2) {
		out.format("boxing invoked");

	}
}
