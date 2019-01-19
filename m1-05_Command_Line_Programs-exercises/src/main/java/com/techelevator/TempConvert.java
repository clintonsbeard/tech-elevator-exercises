package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		System.out.println("Would you like to convert from Fahrenheit or Celsius?");
		
		if (Fahrenheit) {
			System.out.print("Please enter the temperature in Fahrenheit: ");
			double fahrenheitTemperature = in.nextDouble();
			
			System.out.print("Here is your temperature in Celsius: ");
			double fahrenheitTemperature = (fahrenheitTemperature - 32) / 1.8
		}
		if (Celsius) {
			System.out.println("Please enter the temperature (in Celsius): ");
			double celsiusTemperature = in.nextDouble();
			
			System.out.print("Here is your temperature in Celsius: ");
			double celsiusTemperature = in.nextDouble();
		}
		else {
			System.out.println("Unknown command.");
		}	
	}

}
