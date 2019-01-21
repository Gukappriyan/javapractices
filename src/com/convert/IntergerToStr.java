package com.convert;

public class IntergerToStr {

	public static void main(String[] args) {
		
		int intValue = 78;
		
		String first = String.valueOf(intValue);
		String second = Integer.toString(intValue);
		String third = String.format ("%d", intValue);
		
		
		StringBuffer sb = new StringBuffer();
		sb.append(intValue);
		String numberAsString = sb.toString();
		
		StringBuilder sbb = new StringBuilder();
		sbb.append(intValue);
		String numberAsStringBu = sbb.toString();
		
		System.out.println(first);

	}

}
