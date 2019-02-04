package com.techelevator;

public class KataFizzBuzz {

	public String fizzBuzz(int integer) {
		
		if (isBelowOneOrAboveOneHundred(integer)) {
			return "";
		}
		else if (isDivisibleByThreeAndFive(integer) == true || doesContainThreeAndFive(integer) == true) {
			return "FizzBuzz";
		}
		else if (isDivisibleByFive(integer) == true || doesContainFive(integer) == true) {
			return "Buzz";
		}
		else if (isDivisibleByThree(integer) == true || doesContainThree(integer) == true) {
			return "Fizz";
		}
		else {
			return convertToString(integer);
		}
	}
	
	public boolean isBelowOneOrAboveOneHundred(int integer) {
		
		if (integer < 1 || integer > 100) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isDivisibleByThreeAndFive(int integer) {
		
		if (integer % 15 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean doesContainThreeAndFive(int integer) {
		
		String intToString = Integer.toString(integer);
		if (intToString.contains("3") && intToString.contains("5")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isDivisibleByFive(int integer) {
		
		if (integer % 5 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean doesContainFive(int integer) {
		
		String intToString = Integer.toString(integer);
		if (intToString.contains("5")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isDivisibleByThree(int integer) {
		
		if (integer % 3 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean doesContainThree(int integer) {
		
		String intToString = Integer.toString(integer);
		if (intToString.contains("3")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String convertToString(int integer) {
		
		String intToString = Integer.toString(integer);
		return intToString;
	}
	
}