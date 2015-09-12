package com.ashish.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;;

/**
 * Example to specify annoation for a class, methods or fields. 
 * Since it is having two methods it is multi-valued Annotation.
 * Referring to TestCustomAnnotation1 example.
*/

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@interface MyAnnotation {
	int age();
	String name();
}
