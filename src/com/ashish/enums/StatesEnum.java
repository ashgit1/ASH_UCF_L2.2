package com.ashish.enums;

enum States {
	Karnataka("Bangalore"), Maharashtra("Mumbai"), Kerala("Trivandrum");
	String city;

	private States(String c) {
		this.city = c;
	}
}

class StatesEnum {
	
	static States s;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println(States.Kerala.city + " " + s.Karnataka.city + " " + s.Maharashtra.city);	
	}
}