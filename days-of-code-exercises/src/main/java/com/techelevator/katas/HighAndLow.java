package com.techelevator.katas;

public class HighAndLow {
	
	public static String highAndLow(String numbers) {
		String[] splitNumbers = numbers.split(" ");
	    int low = 0;
	    int high = 0;
	    for (int i = 0; i < splitNumbers.length - 1; i++) {
	    	int stringToInt = Integer.parseInt(splitNumbers[i]);
	    	int stringToInt2 = Integer.parseInt(splitNumbers[i + 1]);
	    	if (stringToInt > stringToInt2) {
	    		high = stringToInt;
	    		low = stringToInt2;
	    	}
	    }
	    String lowHigh = low + " " + high;
	    return lowHigh;
	}
}