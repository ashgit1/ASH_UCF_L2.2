package com.ashish.generics;

import java.util.ArrayList;
import java.util.List;

public class WOGenerics {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		List list = new ArrayList();  
		list.add("hello");  
		list.add(5);
		String s = (String) list.get(0);//typecasting
		System.out.println("\n" + s);
		int a = (Integer) list.get(1);
		System.out.println("\n" + a);
	}
}