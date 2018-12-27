package com.programms;

//Check given number is Armstrong or not
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 153;

		int org = input;
		int rem = 0;
		int count = 0;
		while (org >0) {

			rem = org % 10;
			org = org / 10;
			count = count + (rem * rem * rem);
			
		}
		
		if(input == count) {
			System.out.println(input +" is armstrong number");
		}else {
			System.out.println(input +" is not armstrong number");
		}
		

	}

}
