package com.ashish.lamda;

@FunctionalInterface
interface MyComparator {
    public boolean compare(int a1, int a2);
}

public class Lambdacomp {
	public static void main(String []args){
		MyComparator comp = (a1, a2) -> a1 > a2;
		System.out.println(comp.compare(5, 3));
	}
}
