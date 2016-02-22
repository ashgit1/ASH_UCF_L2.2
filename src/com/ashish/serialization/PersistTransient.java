package com.ashish.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersistTransient {
	public static void main(String[] args) throws Exception {
		
		Employee e1 =new Employee(102,"Ashish",26);//creating object  
		//writing object into file  
		FileOutputStream fout = new FileOutputStream("src/com/ashish/serialization/transient.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(e1);
		out.flush();
		System.out.println("Employee object state saved...");
		out.close();
		fout.close();
		
	}

}
