package com.ashish.lamda;

public class Java8Tester {

	final static String salutation = "Hello ";

	public static void main(String args[]) {
		GreetingService greetService1 = (message) -> System.out.println(salutation + message);
		greetService1.sayMessage("Ashishkumar Gupta");
	}

	interface GreetingService {
		void sayMessage(String message);
	}
}