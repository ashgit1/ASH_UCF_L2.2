package com.ashish.imp;

import java.util.ArrayList;
import java.util.List;
public class TestGeneric2 {
   public static void main(String... args) {
       List<Integer> list = new ArrayList<Integer>();
       list.add(6);
       list.add((int)10);
       list.add((Integer)(int)6.0f);
       list.add((Integer)6*6);
        System.out.println("the content of list is"+list);
   }
}
