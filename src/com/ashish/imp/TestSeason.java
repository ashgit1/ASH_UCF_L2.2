package com.ashish.imp;

public class TestSeason {

	enum Seasons {
		SUMMER("hot"), SPRING, WINTER("cold");
		String nature;

		Seasons(String n) {
			nature = n;
		}
		
		Seasons(){
		}			// Actual question doesn't have this piece of code...
	}

	public static void main(String[] args) {
		System.out.println(Seasons.SUMMER.nature + " " + Seasons.SPRING.nature + " " + Seasons.WINTER.nature);
	}
}

/**
 *  Compilation fails since default constructor is not present
 */