package com.ashish.collection;

/**
 * What will be the output on compiling and executing the below code ?
*/		

import java.util.Set;
import java.util.LinkedHashSet;
public class TestSet {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add("Windows");
		s.add("Mac");
		s.add("Mac");
		s.add("Unix");
		System.out.println(s);
	}
}