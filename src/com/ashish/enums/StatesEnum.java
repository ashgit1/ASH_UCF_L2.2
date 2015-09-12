package com.ashish.enums;

enum States {
	Karnataka("Bangalore"), Maharashtra("Mumbai"), Kerala("Trivandrum");
	String city;

	States(String c) {
		city = c;
	}
}

class StatesEnum {
	
	static States s;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println(s.Kerala.city + " " + s.Karnataka.city);	
	}
}