package com.ashish.annotation;

/**
 * @Override annotation assures that the subclass method is overriding the parent class method.
 * If it is not so, compile time error occurs.
 * Sometimes, we does the silly mistake such as spelling mistakes etc. 
 * So, it is better to mark @Override annotation that provides assurity that method is overridden.
*/
class Animal{  
void eatSomething(){
	System.out.println("Animal Eating");
	}  
}
class Dog extends Animal{  
@Override  
void eatSomething(){
	System.out.println("Dog Eating"); //should not be eatsomething()...
	}  
}  
  
public class TestAnnotation1 {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.eatSomething();
		Animal b = new Animal();
		b.eatSomething();
	}
}