package com.ashish.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = -3865587454437178422L;
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}