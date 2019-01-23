package com.techelevator;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		/* Don't think I was supposed to do this with a stack because we
		 * just learned it today, but I did figure it out. 
		 * Let me know if it's a problem and I can try it again.  Thanks! */
		
		while (true) {
			Scanner in = new Scanner (System.in);
			Stack<String> binaryReverse = new Stack<String>();
			String[] userInputtedDecimals;
			
			System.out.print("Please enter in a series of decimal values (separated by spaces): ");
			String userInputDecimals = in.nextLine();
			
			userInputtedDecimals = userInputDecimals.split(" ");
			for (int i = 0; i < userInputtedDecimals.length; i++) {
				int userDecimalsSplit = Integer.parseInt(userInputtedDecimals[i]);
		
				if (userDecimalsSplit == 0) {
					System.out.print("0");
				}
				while (userDecimalsSplit > 0) {
					int modulusCheck = userDecimalsSplit % 2;
					if (modulusCheck == 0) {
						binaryReverse.push("0");
						userDecimalsSplit = userDecimalsSplit / 2;
					}
					else if (modulusCheck == 1) {
						binaryReverse.push("1");
						userDecimalsSplit = userDecimalsSplit / 2;
					}
				}
				while(binaryReverse.isEmpty() == false) {
					System.out.print(binaryReverse.pop());
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}