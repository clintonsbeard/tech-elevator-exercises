package com.techelevator.katas;

/* This time no story, no theory.
 * The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"

The parameter of accum is a string which includes only letters from a..z and A..Z. */

public class Accumul {
    
    public static String accum(String s) {
    	String[] stringSplit = s.split("");
    	String accumTotal = "";
        for (int i = 0; i < stringSplit.length; i++) {
        	int count = i;
        	while (count >= 0) {
        		if (i == count) {
        			accumTotal += stringSplit[i].toUpperCase();
        			count -= 1;
	            }
        		else {
        			accumTotal += stringSplit[i].toLowerCase();
        			count -= 1;
        		}
        		if (count == -1 && i < stringSplit.length - 1) {
        			accumTotal += "-";
        		}
        	}
        }
        return accumTotal;
    }
    
}