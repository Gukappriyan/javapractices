package com.convert;

public class StringToInt {

	public static void main(String[] args) {
		// In summary, parseInt(String) returns a primitive int, whereas valueOf(String) returns a new Integer() object.
		String str = "123";
		
		int frist = Integer.parseInt(str);
		int second = Integer.valueOf(str);
		
		System.out.println(frist+" "+second);
		

	}

}
