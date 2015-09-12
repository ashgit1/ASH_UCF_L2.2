package com.ashish.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * This Example demonstrates custom annotation: creating, applying and accessing annotation
*/

/**
 * MyCustomAnnotation is user defined annotation which will be applied to methods and at runtime.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyCustomAnnotation{
	int value() default 0;
}

/**
 * Applying the Defined Custom Annotation to a method of a class.
 */
class Hello{
	@MyCustomAnnotation(value=5)
	public void sayHello(){
		System.out.println("Say Hello");
	}
}

/**
 * Accessing the Defined Custom Annotation in the main class.
 */
public class TestCustomAnnotation1 {
	public static void main(String[] args) throws Exception {
		
		Hello h = new Hello();	
		Method m = h.getClass().getMethod("sayHello");
		
		MyCustomAnnotation customannotation =  m.getAnnotation(MyCustomAnnotation.class);
		System.out.println(customannotation.value());
	}
}
