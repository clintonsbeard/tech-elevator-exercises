package com.techelevator.personalprojects.rentcalculator;

import java.util.Scanner;

public class RentCalculatorPrint {

	private static RentCalculatorMath getMath = new RentCalculatorMath();
	private Scanner in = new Scanner (System.in);
	
	public void printBanner() {
		System.out.print("\n" + 
				" /$$$$$$$                        /$$            /$$$$$$            /$$                     /$$             /$$                        \n" + 
				"| $$__  $$                      | $$           /$$__  $$          | $$                    | $$            | $$                        \n" + 
				"| $$  \\ $$  /$$$$$$  /$$$$$$$  /$$$$$$        | $$  \\__/  /$$$$$$ | $$  /$$$$$$$ /$$   /$$| $$  /$$$$$$  /$$$$$$    /$$$$$$   /$$$$$$ \n" + 
				"| $$$$$$$/ /$$__  $$| $$__  $$|_  $$_/        | $$       |____  $$| $$ /$$_____/| $$  | $$| $$ |____  $$|_  $$_/   /$$__  $$ /$$__  $$\n" + 
				"| $$__  $$| $$$$$$$$| $$  \\ $$  | $$          | $$        /$$$$$$$| $$| $$      | $$  | $$| $$  /$$$$$$$  | $$    | $$  \\ $$| $$  \\__/\n" + 
				"| $$  \\ $$| $$_____/| $$  | $$  | $$ /$$      | $$    $$ /$$__  $$| $$| $$      | $$  | $$| $$ /$$__  $$  | $$ /$$| $$  | $$| $$      \n" + 
				"| $$  | $$|  $$$$$$$| $$  | $$  |  $$$$/      |  $$$$$$/|  $$$$$$$| $$|  $$$$$$$|  $$$$$$/| $$|  $$$$$$$  |  $$$$/|  $$$$$$/| $$      \n" + 
				"|__/  |__/ \\_______/|__/  |__/   \\___/         \\______/  \\_______/|__/ \\_______/ \\______/ |__/ \\_______/   \\___/   \\______/ |__/      \n" + 
				"                                                                                                                                      \n");
	}
	
	public void electricPrompt() {
		System.out.print("Please enter the amount for the electric bill for this month: ");
		getMath.setElectricBill(in.nextBigDecimal());
		in.nextLine();
	}
	
	public void gasPrompt() {
		System.out.print("Please enter the amount for the gas bill for this month: ");
		getMath.setGasBill(in.nextBigDecimal());
		in.nextLine();
	}
	
	public void printMath() {
		System.out.printf("\n%-27s $%-3.2f", "Hulu: ", getMath.getHuluBill());
		System.out.printf("\n%-27s $%-3.2f", "Netflix: ", getMath.getNetflixBill());
		System.out.printf("\n%-27s $%-3.2f", "Gas Bill (Columbia): ", getMath.getGasBill());
		System.out.printf("\n%-27s $%-3.2f", "Electric Bill (AEP): ", getMath.getElectricBill());
		System.out.printf("\n%-27s $%-3.2f", "Internet Bill (Spectrum): ", getMath.getInternetBill());
		System.out.printf("\n%-27s $%-3.2f", "Rental Insurance (Grange): ", getMath.getGrangeBill());
		System.out.printf("\n-----------------------------------");
		System.out.printf("\n%-27s $%-3.2f", "Total Bills: ", getMath.getTotalBills());
		System.out.printf("\n%-27s $%-3.2f", "Half of Total Bills: ", getMath.getHalfOfTotalBills());
		System.out.printf("\n-----------------------------------");
		System.out.printf("\n%-27s $%-3.2f", "Half of Rent: ", getMath.getHalfOfMonthlyRent());
		System.out.printf("\n%-26s +$%-3.2f", "Half of Total Bills: ", getMath.getHalfOfTotalBills());
		System.out.printf("\n%-27s $%-3.2f", "Lexi's Half of Rent Is:", getMath.getLexiRent());
		System.out.printf("\n-----------------------------------");
		System.out.printf("\n%-27s $%-3.2f", "Half of Rent: ", getMath.getHalfOfMonthlyRent());
		System.out.printf("\n%-26s -$%-3.2f", "Half of Total Bills: ", getMath.getHalfOfTotalBills());
		System.out.printf("\n%-27s $%-3.2f", "Clinton's Half of Rent Is:", getMath.getClintonRent());
		System.out.println("\n");
	}
	
}