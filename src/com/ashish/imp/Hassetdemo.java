package com.ashish.imp;

import java.util.HashSet;

public class Hassetdemo {

	public static void main(String[] args) {
		
		HashSet<String>hs=new HashSet<String>();
		hs.add("hello");
		hs.add("world");
		HashSet<Object> s=new HashSet<Object>();
		//s=hs; //compile error. Type mismatch: cannot convert from HashSet<String> to HashSet<Object>
		System.out.println(hs);

	}

}
