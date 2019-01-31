package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		while (true) {
			System.out.print("Please enter the Fibonacci number: ");
			Scanner in = new Scanner (System.in);
			int fibonacciStop = in.nextInt();
			int f1 = 0;
			int f2 = 1;
			int f3 = f1 + f2;
			for (int i = 0; f3 <= fibonacciStop; ++i) { /* ++i increments i and THEN returns the value, while it's normally the opposite (i++) */
				System.out.print(f1 + ", ");
				f3 = f1 + f2; 
				f1 = f2;
				f2 = f3;
			}
			if (fibonacciStop == 0) {
				System.out.print("");
			}
			System.out.println(f1);
		}
	}
}