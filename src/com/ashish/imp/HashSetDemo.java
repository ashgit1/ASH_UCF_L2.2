package com.ashish.imp;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

		// create a hash set
		Set<String> hs = new LinkedHashSet<String>();
		// add elements to the hash set
		hs.add("Hundred");
		hs.add("Thousand");
		hs.add("Million");
		hs.add("Crore");
		for (Object hs1 : hs) {
			System.out.print(" " + hs1);
		}

	}

}
