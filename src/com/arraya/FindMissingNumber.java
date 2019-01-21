package com.arraya;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fine the missing number");

		int[] givenNum = new int[] { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		int totalCount = 10;
		int serialTotal = 0;
		for (int number : givenNum) {
			sum = sum + number;
			
		}

		serialTotal = (totalCount+1) * totalCount / 2;
		System.out.println(serialTotal);
		System.out.println(sum);
		System.out.println("Missing one number is : " + (serialTotal - sum));

	}

}
