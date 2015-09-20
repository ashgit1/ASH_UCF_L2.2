package com.ashish.enums;

/** Initializing specific values to the enum constants:
 *  The enum constants have initial value that starts from 0, 1, 2, 3 and so on.
 *  But we can initialize the specific value to the enum constants by defining fields and constructors.
 *  As specified earlier, Enum can have fields, constructors and methods
*/

public class EnumExample4 {

	enum Season {
		WINTER(5), SPRING(10), SUMMER(15), FALL("YES");
		private int value;
		private String value1;
		
		private Season(int value) {
			this.value = value;
		}
		
		private Season(String value1){
			this.value1 = value1;
		}
	}

	public static void main(String[] args) {
		for(Season s : Season.values()){
			System.out.println("\n" + s +": " + s.value + " | " + s.value1 + " | " + Season.FALL.value1);
		}
	}

}
