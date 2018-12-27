package com.arraya;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fine the missing number");

		int[] givenNum = new int[] { 1, 2, 4, 5 };
		int sum = 0;
		int totalCount = 5;
		int serialTotal = 0;
		for (int number : givenNum) {
			sum = sum + number;
		}

		serialTotal = totalCount * ((totalCount + 1) / 2);

		System.out.println("Missing one number is : " + (serialTotal - sum));

	}

}
