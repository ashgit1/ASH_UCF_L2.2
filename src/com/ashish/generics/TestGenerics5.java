package com.ashish.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple example to create and use wildcard(?).
*/


abstract class Shape{
	abstract void drawShape();
}

class Rectangle extends Shape{
	@Override
	void drawShape() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape{
	@Override
	void drawShape() {
		System.out.println("Drawing Circle");
	}
}

public class TestGenerics5 {
	public static void main(String[] args) {
		
		List<Rectangle> rect = new ArrayList<Rectangle>();
		rect.add(new Rectangle());
		drawShapes(rect);
		
		List<Circle> cir = new ArrayList<Circle>();
		cir.add(new Circle());
		cir.add(new Circle());
		drawShapes(cir);
	}
	
	//creating a method that accepts only child class of Shape
	public static void drawShapes(List<? extends Shape> shapeList){
		for(Shape s : shapeList){
			s.drawShape();
		}
	}
}