package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		while (true) {
			Scanner in = new Scanner (System.in);
			System.out.print("Please enter the length: ");
			double length = in.nextDouble();
			
			System.out.print("Is the measurement in (m)eters, or (f)eet? ");
			in.nextLine().toUpperCase();
			String metersOrFeet = in.nextLine().toUpperCase();
			 
			switch (metersOrFeet) {
				case "M":
					System.out.printf("%-1.0f",length);
					System.out.print("m is ");
					System.out.printf("%-1.0f",length * 3.2808399);
					System.out.print("f.");
					System.out.println();
					break;
				case "F":
					System.out.printf("%-1.0f",length);
					System.out.print("f is ");
					System.out.printf("%-1.0f",length * 0.3048);
					System.out.print("m.");
					System.out.println();
					break;
				default:
					System.out.println("Unknown command.  Restarting program.");
					break;
			}
		}
	}	
}