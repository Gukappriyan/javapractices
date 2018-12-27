package com.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentance = "Gukan is very good boy";
		
		List<String> words = Arrays.asList(sentance.split("\\s+"));
		
		Collections.reverse(words);
		System.out.println(words);
		StringBuilder sp  = new StringBuilder(sentance.length());
		for(int i=0; i<=words.size()-1; i++) {
			sp.append(words.get(i));
			sp.append(" ");
		}
		
		System.out.println(sp.toString().trim());
	}

}
