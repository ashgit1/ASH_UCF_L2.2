package com.ashish.lamda;

public class Java8Tester {
	
	   final static String salutation = "Hello! ";
	   public static void main(String args[]){
	      int message;
	      /*GreetingService greetService1 = message -> System.out.println(salutation + message);
	      greetService1.sayMessage("Mahesh");*/   
	   }   
	   interface GreetingService {
	      void sayMessage(String message);
	   }
	}