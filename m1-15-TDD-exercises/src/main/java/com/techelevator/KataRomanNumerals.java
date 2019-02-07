package com.techelevator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class KataRomanNumerals {

	public int convertToDigit(String romanNumeral) {
		
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		int value = 0;
		
		for (int i = 0; i < romanNumeral.length(); i++) {
		int nextIndex = i + 1;
			if (nextIndex < romanNumeral.length()) {
				if (romanMap.get(romanNumeral.charAt(i)) < romanMap.get(romanNumeral.charAt(nextIndex))) {
					value = value + (romanMap.get(romanNumeral.charAt(nextIndex)) - romanMap.get(romanNumeral.charAt(i)));
					i++;
				}
				else {
					value += romanMap.get(romanNumeral.charAt(i));
				}
			}
			else {
				value += romanMap.get(romanNumeral.charAt(i));
			}
		}
		return value;
	}
	
	public String convertToRomanNumeral(int n) {
		
		Map<Integer, String> numberMap = new LinkedHashMap<>();
		numberMap.put(1000, "M");
		numberMap.put(900, "CM");
		numberMap.put(500, "D");
		numberMap.put(400, "CD");
		numberMap.put(100, "C");
		numberMap.put(90, "XC");
		numberMap.put(50, "L");
		numberMap.put(40, "XL");
		numberMap.put(10, "X");
		numberMap.put(9, "IX");
		numberMap.put(5, "V");
		numberMap.put(4, "IV");
		numberMap.put(1, "I");
		
		Map<String, Integer> numberLookup = new LinkedHashMap<>();
		numberLookup.put("M", 1000);
		numberLookup.put("CM", 900);
		numberLookup.put("D", 500);
		numberLookup.put("CD", 400);
		numberLookup.put("C", 100);
		numberLookup.put("XC", 90);
		numberLookup.put("L", 50);
		numberLookup.put("XL", 40);
		numberLookup.put("X", 10);
		numberLookup.put("IX", 9);
		numberLookup.put("V", 5);
		numberLookup.put("IV", 4);
		numberLookup.put("I", 1);

		String value = "";
		
		while(n > 0) {
			int valueCheck = numberLookup.get(numberLookup.keySet().toArray()[0]);
			if (n >= valueCheck) {
				n -= valueCheck;
				value += numberMap.get(numberMap.keySet().toArray()[0]);
			}
			else {
				numberMap.remove(numberMap.keySet().toArray()[0]);
				numberLookup.remove(numberLookup.keySet().toArray()[0]);
			}
		}
		return value;
	}
	
}