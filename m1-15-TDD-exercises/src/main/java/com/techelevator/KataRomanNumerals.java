package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class KataRomanNumerals {

	public String convertToRomanNumeral(int n) {
		
		Map<Integer, Character> numberMap = new HashMap<>();
		numberMap.put(1, 'I');
		numberMap.put(5, 'V');
		numberMap.put(10, 'X');
		numberMap.put(50, 'L');
		numberMap.put(100, 'C');
		numberMap.put(500, 'D');
		numberMap.put(1000, 'M');
		
	}

	public int convertToDigit(String romanNumeral) {
		
		/* If previous number is smaller than value of the two characters, current - last */
		
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
			value += romanMap.get(romanNumeral.charAt(i));
		}
		
		return value;
	}
	
}