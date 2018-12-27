package com.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindFirstNonRepeatedCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "gukappriayn";
		
		Map<Character, Integer> count = new LinkedHashMap<>(input.length());
		
		char[] inputCh = input.toCharArray();
		
		for(Character ch:inputCh) {
		
			if(count.containsKey(ch)) {
				count.put(ch, count.get(ch)+1);
			}else {
				count.put(ch, 1);
			}
		
		}
		System.out.println(count);
		
	//	Set<Map.Entry<Character, Integer>> enterySet  = count.entrySet();
		
		for(Entry<Character, Integer>entry:count.entrySet()){
			
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

}
