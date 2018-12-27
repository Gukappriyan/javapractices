package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDublicateCharter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input  = "gukappriyan";
		
		char[] chInput = input.toCharArray();
		
		HashMap<Character, Integer> printDu = new HashMap<>();
		
		for(Character ch:chInput) {
			
			if(printDu.containsKey(ch)) {
				
				printDu.put(ch, printDu.get(ch)+1);
			}else {
				
				printDu.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = printDu.entrySet();
		
		for(Map.Entry<Character, Integer> entry:entrySet) {
			
			if(entry.getValue()>1) {
				
				System.out.println(entry.getKey()+"  : "+entry.getValue());
			}
		}
		
		
		System.out.println(printDu);
	}

}
