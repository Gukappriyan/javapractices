package com.string;

import java.util.Arrays;
import java.util.List;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input  = "Gukan is an Lead QA";
		System.out.println(count(input));
		
		List<String> count = Arrays.asList(input.split("\\s+"));
		
		System.out.println(count.size());
		
	}
	public static int count(String str) {
		
		if(str == null) {
			return 0;
		}
		
		String input = str.trim();
		int count = input.split("\\s+").length;
		return count;
	}

}
