package com.string;

import java.util.HashSet;
import java.util.Set;

public class FindDublicateWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "This sentence contains two words, one and two";
		
		Set<String> dublicate = new HashSet<String>();
		Set<String> tmpSet = new HashSet<String>();
		
		String[] words = input.split("\\s+");
		
		for(String word:words) {
			
			if(!tmpSet.add(word)) {
				dublicate.add(word);
			}
		}
		
		System.out.println(input);
		System.out.println(dublicate);

	}

}
