package com.ashish.formatter;

import static java.lang.System.*;

public class BooleanFormatter {

	public static void main(String[] args) {
		Short s1 = 32 + 32;
		Short s2 = 64;
		out.format("%b,%b", (s1 == s2), (s1.equals(s2)));

	}
}
