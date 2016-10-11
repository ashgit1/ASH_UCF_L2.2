package com.ashish.imp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hassetdemo {

	public static void main(String[] args) {
		
		Set<String>hs=new TreeSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("six");
		HashSet<Object> s=new HashSet<Object>();
		//s=hs; //compile error. Type mismatch: cannot convert from HashSet<String> to HashSet<Object>
		System.out.println(hs);

	}

}
