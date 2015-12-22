package com.ashish.imp;

public class Foo {

	static String hello="";
	
	String doStuff(int x){return hello;}
	int doStuff1(int x){return 42;}
	public String doStuff2(int x){return hello;}
	protected String doStuff3(int x){return hello;}
}
