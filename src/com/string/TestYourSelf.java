package com.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TestYourSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Reverse
		
		String input = "gukappriyan";
		String reverse = "";
		
		for (int i= input.length()-1; i>=0; i--) {
			
			reverse = reverse + input.charAt(i);
			
		}
		System.out.println(reverse);
	}	
		/*
		// Find the duplicate words in the string

		String givenStr = "Today i write one or two program yes one";

		String[] splitStr = givenStr.split("\\s+");

		System.out.println(Arrays.toString(splitStr));

		for (String one : splitStr) {

			System.out.println(one);
		}

		Set<String> orgSet = new HashSet<String>();
		Set<String> dublicateSet = new HashSet<String>();

		for (String word : splitStr) {

			if (!orgSet.add(word)) {
				dublicateSet.add(word);
			}
		}

		System.out.println(orgSet);
		System.out.println(dublicateSet);
		//---------------------------------------------------------------------
		// Find the duplicate charter in given string

		String input = "gukappriyan";

		char[] inputChar = input.toCharArray();

		HashMap<Character, Integer> mapInput = new HashMap<>();

		for (Character ch : inputChar) {

			if (mapInput.containsKey(ch)) {
				mapInput.put(ch, mapInput.get(ch) + 1);
			} else {
				mapInput.put(ch, 1);
			}

		}
		
		System.out.println(mapInput);

	
	*/

}