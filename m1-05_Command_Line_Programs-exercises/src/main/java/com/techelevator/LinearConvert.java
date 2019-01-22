package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		while (true) {
			
			System.out.print("Please enter the length: ");
			
			Scanner in = new Scanner (System.in);
			double length = in.nextDouble();
			
			System.out.print("Is the measurement in (m)eters, or (f)eet? ");
			in.nextLine();
			String metersOrFeet = in.nextLine();
			 
			if (metersOrFeet.equalsIgnoreCase("m")) {
				System.out.printf("%-2.0f",length);
				System.out.print("m is ");
				System.out.printf("%-2.0f",length * 3.2808399);
				System.out.print("f.");
				System.out.println();
			}
			else if (metersOrFeet.equalsIgnoreCase("f")) {
				System.out.printf("%-2.0f",length);
				System.out.print("f is ");
				System.out.printf("%-2.0f",length * 0.3048);
				System.out.print("m.");
				System.out.println();
			}
			else {
				System.out.print("Unknown command.  Please choose either m for meters or f for feet:");
				in.nextLine();
			}
		}
	}
	
}