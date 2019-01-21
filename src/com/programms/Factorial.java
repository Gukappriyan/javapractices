package com.programms;

/**
 * 
 * @author gukappriyan_d 3! = 3 * 2 * 1 = 6 4! = 4* 3* 2* 1 = 24
 */

public class Factorial {

	public static int fact(int num) {
		int factVa = 1;

		if (num == 0)
			return 1;
		else {

			for (int i = 1; i <= num; i++) {

				factVa = factVa * i;
			}
		}

		return factVa;
	}

	public static int factRecursion(int num) {

		if (num == 0)
			return 1;
		
		return num * factRecursion(num-1);
	}

	public static void main(String[] args) {

		System.out.println("Factorial of 3 is : " + fact(3));
		System.out.println("Factorial of 0 is : " + fact(0));
		System.out.println("Factorial of 1 is : " + fact(1));
		
		System.out.println("Factorial of 3 is : " + factRecursion(3));

	}

}
