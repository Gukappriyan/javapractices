package com.string;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method 1
		
		String input = "gukappriyan";
		String output = "";
		
		for(int i=input.length()-1; i>=0;i--) {
			
			output = output+input.charAt(i);
		}
		System.out.println(output);
		
		//------------------------------
		// Method 2
		
		String strBuf = new StringBuffer(input).reverse().toString();
		System.out.println(strBuf);
		
		
	}

}
