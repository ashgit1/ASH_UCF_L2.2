package com.ashish.assertion;

import org.junit.Assert;

public class AssertException {
	
	public static void main(String []args){
	
		try{
			Assert.assertEquals("1", "2");
		}
		catch(AssertionError e){
			System.out.println("Assert Error caught");
		}
	}
}

/*
 * This way we can catch the assertion errors but shouldn't do it.
 * catch should AssertionError
 * Since the assert statements are believed to be true always.
 * This is a very unusual way to use assertions - they should usually pass 
 * and if they fail it is very unusual for you to want to carry on program execution. 
 * That's why the failure throws an AssertionError which extends Error not an Exception
 * Summary AssertionError throws Error not Exception.
 * If you get error stop the program execution rather than continuing.
 * */
