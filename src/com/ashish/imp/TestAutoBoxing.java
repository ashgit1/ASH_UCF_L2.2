package com.ashish.imp;

public class TestAutoBoxing {

	public static void main(String[] args) {
		Byte b1=101;
        Byte b2=102;
        process(b1, b2);
	}

	static void process(byte b1, Short b2){
        System.out.println("Using Boxing ...");
	}
	static void process (byte... var) {
		System.out.println("Using Variable Argument Lists ...");
    }
    static void process(byte b1, byte b2){
    	System.out.println("Using Widening ...");
    }

}
