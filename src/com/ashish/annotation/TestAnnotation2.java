package com.ashish.annotation;

import java.util.ArrayList;

/**
 * @SuppressWarnings annotation: is used to suppress warnings issued by the compiler.
*/
public class TestAnnotation2 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();  
		list.add("sonoo");  
		list.add("vimal");  
		list.add("ratan");  
		list.add(10);
		  
		for(Object obj:list)  
		System.out.println(obj); 	
	}
}
/**
 * If you remove the @SuppressWarnings("unchecked") annotation, it will show warning at compile time 
 * because we are using non-generic collection.
*/