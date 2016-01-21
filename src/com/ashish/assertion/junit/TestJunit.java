package com.ashish.assertion.junit;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
   @Test
   public void testAdd() {
      String str= "Junit is working fine";
      assertEquals("Junit is working fine", str);
   }
   
   @Ignore
   public void testIgnore(){
	   int a=10;
	   assertEquals(5, a);
   }
}