package com.ashish.enums;

public class StatesEnum2 {

	enum States {
		Karnataka("Bangalore"), Maharashtra("Mumbai"), Kerala("Trivandrum");
		String city;

		private States(String c) {
			this.city = c;
		}
	}
	
	public static void main(String[] args) {
		
		for(States s : States.values()){
			System.out.println("State: " + s + ", City: " + s.city);
		}

	}

}
