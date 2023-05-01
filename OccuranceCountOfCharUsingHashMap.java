package com.org.programs;

import java.util.HashMap;

public class OccuranceCountOfCharUsingHashMap {

	public static void main(String[] args) {

		String inputStr = "Lets Make Automation Easy"; 

		// HashMap character as a key and occurrence as a value
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
		int len = inputStr.length();

		for (int i = 0; i<len ; i++) {
			Character key = inputStr.charAt(i);
			if (charCountMap.containsKey(key)) {
				int count = charCountMap.get(key);
				charCountMap.put(key, count+1);
			} else {
				charCountMap.put(key, 1);
			}
		}
		System.out.println(charCountMap);

	}

}
