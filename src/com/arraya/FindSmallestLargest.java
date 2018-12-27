package com.arraya;

public class FindSmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {4,2,55,88,1};
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for(int i=0; i< numbers.length; i++) {
			
			if(smallest > numbers[i]) {
				smallest = numbers[i];
			}
			
			if(largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		System.out.println("Smallest : "+ smallest );
		System.out.println("Smallest : "+ largest );
	}

}
