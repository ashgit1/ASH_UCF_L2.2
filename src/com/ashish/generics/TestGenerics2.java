package com.ashish.generics;

import java.util.*;

public class TestGenerics2 {
	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "vijay");
		map.put(4, "umesh");
		map.put(3, "Ashish");
		map.put(2, "Ashu");

		// Now use Map.Entry for Set and Iterator
		Set<Map.Entry<Integer, String>> set = map.entrySet();

		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> e = itr.next();// no need to typecast
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
