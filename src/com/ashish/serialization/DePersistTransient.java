package com.ashish.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DePersistTransient {

	public static void main(String[] args) throws Exception {

	ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/com/ashish/serialization/transient.txt"));
	Employee e = (Employee)in.readObject();
	System.out.println("id: " + e.id + ", name: " + e.name + ", age: " + e.age);
	in.close();
	}
}
