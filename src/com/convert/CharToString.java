package com.convert;

public class CharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a = 'a';
		
		String first = Character.toString(a);
		String second = ""+a;
		String third  = new String(new char[] {a});
		String four = String.valueOf(a);
		
		System.out.println(first+" "+second+" "+third +" "+four);

	}

}
