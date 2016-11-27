package com.ashish.ivquestions;

import java.util.ArrayList;

public class ArrangeNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> masterList = new ArrayList<Integer>();
		ArrayList<Integer> showNumber = new ArrayList<Integer>();
		
		// fill the masterList...
		for(int i=1; i<=10000; i++){
			masterList.add(i);
		}
		
		long startTime = System.currentTimeMillis();
		
		// Odd arrangement first...
		for(int j : masterList){
			if(j%2 != 0){
				showNumber.add(j);
				j+=2;
			}
		}
		
		// Even arrangement second...
		for(int k  :masterList){
			if(k%2 == 0){
				showNumber.add(k);
				k+=2;
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Calcution time : " + (endTime-startTime));
	
		
		/*System.out.println("MasterList :");
		for(int show : masterList){
			System.out.println(show);
		}*/
		
		System.out.println("--------------------------------------");
		
		System.out.println("Final Output:");
		for(int print : showNumber){
			System.out.println(print);
		}

	}

}
