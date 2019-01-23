package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		while (true) {
			System.out.print("Please enter the temperature: ");
			Scanner in = new Scanner (System.in);
			double temperature = in.nextDouble();
			
			System.out.print("Is the temperature in (C)elcius, or (F)arenheit? ");
			in.nextLine();
			String fahrenheitOrCelsius = in.nextLine();
			 
			if (fahrenheitOrCelsius.equalsIgnoreCase("c")) {
				System.out.printf("%-1.0f",temperature);
				System.out.print("C is ");
				System.out.printf("%-1.0f",temperature * 1.8 + 32.0);
				System.out.print("F.");
				System.out.println();
			}
			else if (fahrenheitOrCelsius.equalsIgnoreCase("f")) {
				System.out.printf("%-1.0f",temperature);
				System.out.print("F is ");
				System.out.printf("%-1.0f",(temperature - 32.0) / 1.8);
				System.out.print("C.");
				System.out.println();
			}
			else {
				System.out.println("Unknown command.  Restarting program.");
			}
		}
	}
}