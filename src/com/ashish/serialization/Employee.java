package com.ashish.serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = -6033095920750877597L;
	
	int id;
	String name;
	transient int age;// Now it will not be serialized

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
