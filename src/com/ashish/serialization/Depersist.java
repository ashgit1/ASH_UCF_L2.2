package com.ashish.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws Exception{
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/com/ashish/serialization/g.txt"));
		Student stud = (Student)in.readObject();
		System.out.println("id: " + stud.id + " name: " + stud.name);
		in.close();
		
	}

}
