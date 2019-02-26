package com.techelevator.personalprojects.rentcalculator;

public class RentCalculator {
	
	private static RentCalculatorPrint print = new RentCalculatorPrint();

	public static void main(String[] args) {
		print.printBanner();
		while (true) {
			print.electricPrompt();
			print.gasPrompt();
			print.printMath();
		}
	}
	
}