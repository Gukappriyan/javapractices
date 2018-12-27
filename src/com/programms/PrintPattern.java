package com.programms;

/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 
 *     ***1
 *     **12
 *     *123
 *     1234
 */

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++) {
			
			for(int k=3;k>=i;k--) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
