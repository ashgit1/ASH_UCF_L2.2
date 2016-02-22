package com.ashish.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

	
	public static void main(String[] args) throws Exception{
		 Student s1 = new Student(212,"Ashish");  
		 FileOutputStream fout = new FileOutputStream("src/com/ashish/serialization/g.txt");  
		 ObjectOutputStream out=new ObjectOutputStream(fout);
		 
		 out.writeObject(s1);
		 out.flush();
		 System.out.println("obj state saved...");
		 out.close();
	}

}
