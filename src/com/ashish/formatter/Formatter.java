package com.ashish.formatter;

public 
class Formatter {

/**
 * Check that the Compiler compliance level is set to at least 1.5 for your project. 
 * otherwise : System.out.printf("%s", "Ashish"); will give exception.
 * Project -> Properties -> Java Compiler
 * if Enable project specific settings is not set, use the Configure Workspace Settings... 
 * link on that page to check the global Compiler compliance level
*/
	
public static void main(String[] args) {
	
		//System.out.printf("%s", "Ashish");
		String heading1 = "Exam_Name";
		String heading2 = "Exam_Grade";
		System.out.println("---------------------------------------");
		System.out.printf( "%-15s %15s %n", heading1, heading2);
		System.out.println("---------------------------------------");
		System.out.printf( "%-15s %15s %n", "JAVA",  "A");
		System.out.printf( "%-15s %15s %n", "DOTNET","B");
		System.out.printf( "%-15s %15s %n", "PHP", 	 "C");
		System.out.println("---------------------------------------");
		System.out.printf("%s %d %n", "Ashish's Total: ", 254);
		System.out.println("---------------------------------------");
		System.out.printf("%s %f %n","Percentage :",75.52);
		System.out.println("---------------------------------------");
		System.out.println("############### EXAM OVER #############");
	}
}