package com.ashish.collection;

import java.util.*;
import java.io.*;

public class CreatePropertiesFile {
	public static void main(String[] args) throws Exception {

		Properties p = new Properties();
		p.setProperty("name", "Ashishkumar Gupta");
		p.setProperty("email", "ashishkumar.gupta@wipro.com");
		p.setProperty("age", "27");

		p.store(new FileWriter("info.properties"),"Example for creating properties files");

	}
}