package com.programms;


// print the fibonacci ser
// a+b b+b
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=0,a,b;
		a = 1;
		b = 1;
		System.out.print(a+","+b);
		while(k<=50) {
			k  = a+b;
			System.out.print(",");
			System.out.print(k);
			a = b;
			b = k;
		}
		
		
	}

}
