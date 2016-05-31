package com.ashish.imp;

public class Finonacci {

	public static void main(String[] args) {

		int i = 1, j = 1;
		int fib = 0;
		int n = 100;
		System.out.print(i + " " + j);
		while (fib < 100) {
			fib = i + j;
			i = j;
			j = fib;
			if (fib > n) {
				break;
			}
			System.out.print(" " + fib);
		}
	}
}