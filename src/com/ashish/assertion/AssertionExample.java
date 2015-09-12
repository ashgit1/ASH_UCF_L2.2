package com.ashish.assertion;

import java.util.Scanner;

public class AssertionExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ur age ");
		int value = scanner.nextInt();
		
		assert value >= 18 : " Please enter age greater than 18 to Sign Up";
		
		System.out.println("value is " + value);
		scanner.close();
	}
}
