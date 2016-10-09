package com.ashish.assertion;

import java.util.Scanner;

public class AssertArg2 {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name\n");
		String name = scan.nextLine();
		display(name);
		scan.close();
	}

	private static void display(String name) {
		
		if(name!=null && name.trim()!="" && name.trim().length()>0) {
			System.out.println("Welcome " + name);
		}else{
			throw new IllegalArgumentException("name has no context");
		}
	}
}
