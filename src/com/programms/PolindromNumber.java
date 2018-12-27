package com.programms;

import java.util.Scanner;

//Check given number is polindrom or not
public class PolindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int givenIn = input.nextInt();
		int rem, count = 0, org, s = 0;
		org = givenIn;

		while (org > 0) {
			rem = org % 10;
			org = org / 10;
			s = (s * 10) + rem;
		}
		
		if(givenIn == s) {
			System.out.println(givenIn+" is polindrom");
		}else {
			System.out.println(givenIn+" is not polindrom");
		}

	}

}
