package com.string;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fisrtStr = "abc";
		String secondStr = "cba";
		
		String reverce = "";
		
		for(int i= secondStr.length()-1; i>=0; i--) {
			
			reverce = reverce + secondStr.charAt(i);
		}
		
		System.out.println(reverce);
		
		if(fisrtStr.equals(reverce)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
