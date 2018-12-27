package com.programms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int input = 29;
		boolean isPrime = true;
		
		
		for(int i=2;i<input;i++) {
			
			if(input%i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(input+" Is Prime Number");
		}else {
			System.out.println(input+" is not Prime number");
		}

	}

}
