package com.collectionexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, String> phoneMap = new HashMap<>();
		phoneMap.put("gukan", "9865345676");
		phoneMap.put("Priyan", "897867546");
		phoneMap.put("jack", "9089098767");
		phoneMap.put("New Conn1", null);
		phoneMap.put("New Conn2", null);
		phoneMap.put(null, "Default");
		phoneMap.put(null, null);
		
		Set<String> phoneSet = phoneMap.keySet();
		
		for(String i:phoneSet) {
			
			System.out.println("Key : "+i+" Value :"+phoneMap.get(i));
		}
		
		Set<Map.Entry<String, String>> phoneESet = phoneMap.entrySet();
		
		for(Map.Entry<String, String> value:phoneESet) {
			
			System.out.println(value.getKey()+" : "+ value.getValue());
		}

	}

}
