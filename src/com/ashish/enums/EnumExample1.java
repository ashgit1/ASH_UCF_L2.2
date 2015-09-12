package com.ashish.enums;

public class EnumExample1 {
	
	public enum Sport {Cricket, Tennis, Football};
	
	public static void main(String[] args) {
		for(Sport s : Sport.values()){
			System.out.println("\n" + s );
		}	
	}
}
