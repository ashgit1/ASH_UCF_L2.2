package com.ashish.imp;

abstract class Vehicle{
	protected abstract int maxSpeed();
}

class Car extends Vehicle{
	@Override
	protected int maxSpeed() { // can be public or protected but not private
		return 120;
	}
}

class Bike extends Vehicle{
	@Override
	public int maxSpeed() {  // can be public or protected but not private
		return 150;
	}
}

public class OverrideRestriction {
	public static void main(String args[]){
		Vehicle car = new Car();
		System.out.println("Max car speed : " + car.maxSpeed());
		Vehicle bike = new Bike();
		System.out.println("Max bike speed : " + bike.maxSpeed());
	}
}