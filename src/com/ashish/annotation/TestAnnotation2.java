package com.ashish.annotation;

import java.util.ArrayList;

/**
 * @SuppressWarnings annotation: is used to suppress warnings issued by the compiler.
*/
@SuppressWarnings("unchecked")
public class TestAnnotation2 {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();  
		list.add("sonoo");  
		list.add("vimal");  
		list.add("ratan");  
		  
		for(Object obj:list)  
		System.out.println(obj); 	
	}
}
/**
 * If you remove the @SuppressWarnings("unchecked") annotation, it will show warning at compile time 
 * because we are using non-generic collection.
*/