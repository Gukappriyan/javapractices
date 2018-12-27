package com.arraya;

public class FindPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] serial = {8,9,2,5,3,6,4};
		int sum = 7;
		
		for(int i=0; i< serial.length;i++) {
			int first = serial[i];
			
			for(int j=i+1;j<serial.length;j++) {
				int second = serial[j];
				if((first+second)== sum) {
					
					System.out.printf("Pair is (%d,%d)",first,second);
				}
					
			}
		}
	}

}
