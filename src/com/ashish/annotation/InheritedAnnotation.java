package com.ashish.annotation;

import org.apache.log4j.Logger;

@UninheritedAnnotationType
class X {
}

@InheritedAnnotationType
class Y extends X {
}

class Z extends Y {
}

public class InheritedAnnotation {
	
	final static Logger logger = Logger.getLogger(InheritedAnnotation.class);
	
	public static void main(String[] args) {
		logger.info(new X().getClass().getAnnotation(InheritedAnnotationType.class));
		logger.info(new Y().getClass().getAnnotation(InheritedAnnotationType.class));
		logger.info(new Z().getClass().getAnnotation(InheritedAnnotationType.class));
		logger.info("_________________________________");
		logger.info(new X().getClass().getAnnotation(UninheritedAnnotationType.class));
		logger.info(new Y().getClass().getAnnotation(UninheritedAnnotationType.class));
		logger.info(new Z().getClass().getAnnotation(UninheritedAnnotationType.class));
		
		System.out.println(new X().getClass().getAnnotation(InheritedAnnotationType.class));
		System.out.println(new Y().getClass().getAnnotation(InheritedAnnotationType.class));
		System.out.println(new Z().getClass().getAnnotation(InheritedAnnotationType.class));
		System.out.println("_________________________________");
		System.out.println(new X().getClass().getAnnotation(UninheritedAnnotationType.class));
		System.out.println(new Y().getClass().getAnnotation(UninheritedAnnotationType.class));
		System.out.println(new Z().getClass().getAnnotation(UninheritedAnnotationType.class));
		
	}
}
