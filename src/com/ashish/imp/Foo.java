package com.ashish.imp;
import static java.lang.System.*;

public class Foo {

	static String hello="";  // since the string is not initialized it will print nothing for the 3 String methods. 
	
	String doStuff(int x){return hello;}
	int doStuff1(int x){return 42;}
	public String doStuff2(int x){return hello;}
	protected String doStuff3(int x){return hello;}
	
	public static void main(String... args){
		out.println(new Foo().doStuff(0));
		out.println(new Foo().doStuff1(1));
		out.println(new Foo().doStuff2(2));
		out.print(new Foo().doStuff3(3));
	}
	
}
