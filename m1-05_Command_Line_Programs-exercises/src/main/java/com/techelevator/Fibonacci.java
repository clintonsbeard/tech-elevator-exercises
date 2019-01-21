package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.print("Please enter the Fibonacci number: ");
		
		Scanner in = new Scanner (System.in); /* References Scanner to create user input */
		int fibonacciStop = in.nextInt(); /* User gives the number to stop at */
		
		int fibonacci = 0; /* Start of the Fibonacci is 0 */
		
		int a = 0;
		int b = 1;
		int c = a + b;
		
		for (int i = 0; i < fibonacciStop; i = i + 1) { /* Starts at 0, stops when it's equal to or larger than the user given integer,  */
			if (fibonacci < fibonacciStop) { /* If the total Fibonacci is less than the user given number... */
				fibonacci = fibonacci + i; 
				System.out.print(fibonacci); /* Print this step of the Fibonacci number */
				System.out.print(", "); /* And a comma and a space for formatting */
			}
			else {
				System.out.print(i);
			}
		}

	}
	
}
