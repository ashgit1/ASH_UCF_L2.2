package com.ashish.assertion;

public class Assert1 {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++)
			for (int j = 1; j < 4; j++)
				if (i < j)
					assert i != j : i;	
	}
}
