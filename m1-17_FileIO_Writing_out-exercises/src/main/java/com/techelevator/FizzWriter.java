package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws Exception {

		File newFile = new File("FizzBuzz.txt");
		newFile.createNewFile();
		
		try(PrintWriter printWriter = new PrintWriter(newFile);
			BufferedWriter buffered = new BufferedWriter(printWriter)) {
			for (int i = 1; i <= 300; i++) {
				if (isDivisibleByThreeAndFive(i)) {
					buffered.write(i + ": FizzBuzz" + "\n");
				}
				else if (isDivisibleByFive(i) || doesContainFive(i)) {
					buffered.write(i + ": Buzz" + "\n");
				}
				else if (isDivisibleByThree(i) || doesContainThree(i)) {
					buffered.write(i + ": Fizz" + "\n");
				}
				else {
					buffered.write(i + ": " + i + "\n");
				}
				buffered.flush();
			}
		}
	}
	
	public static boolean isDivisibleByThreeAndFive(int integer) {
			
		if (integer % 15 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isDivisibleByFive(int integer) {
		
		if (integer % 5 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean doesContainFive(int integer) {
		
		String intToString = Integer.toString(integer);
		if (intToString.contains("5")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isDivisibleByThree(int integer) {
		
		if (integer % 3 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean doesContainThree(int integer) {
		
		String intToString = Integer.toString(integer);
		if (intToString.contains("3")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}