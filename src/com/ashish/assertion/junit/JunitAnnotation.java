package com.ashish.assertion.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotation {
	
   //execute before class
   @BeforeClass
   public static void beforeClass() {
      System.out.println("before class");
   }

   //execute after class
   @AfterClass
   public static void  afterClass() {
      System.out.println("after class");
   }

   //execute before test
   @Before
   public void before() {
      System.out.println("before");
   }
	
   //execute after test
   @After
   public void after() {
      System.out.println("after");
   }
	
   //test case
   @Test
   public void test() {
      System.out.println("test");
   }
	
   //test case ignore and will not execute
   @Ignore
   public void ignoreTest() {
      System.out.println("ignore test");
   }
}