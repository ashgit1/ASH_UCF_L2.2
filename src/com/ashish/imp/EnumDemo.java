package com.ashish.imp;

public class EnumDemo {

	enum DAYS{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    //	abstract void getDays();   enum can't be abstract any time
}

	public static void main(String[] args) {
		System.out.println(DAYS.WEDNESDAY);	
	}

}
