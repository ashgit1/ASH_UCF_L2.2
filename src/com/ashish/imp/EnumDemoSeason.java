package com.ashish.imp;

enum EnumDemo1{SPRING,SUMMER,WINTER,AUTUMN;
EnumDemo1(){
	System.out.println("after returning");
}
}

public class EnumDemoSeason {
	public static void main(String[] args) {
	System.out.println(EnumDemo1.AUTUMN);	
	}
}
