package com.ashish.assertion;

import java.util.Scanner;

public class AssertArg {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name\n");
		String name = scan.nextLine();
		display(name);
		scan.close();
	}

	private static void display(String name) {
		
		assert (name!=null && name!="" && name.length() > 0 ) : 
				"Please enter name";
		System.out.println("Welcome " + name);
	}
}
