package com.techelevator.PostageCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.TollBoothCalculator.Car;
import com.techelevator.TollBoothCalculator.Tank;
import com.techelevator.TollBoothCalculator.Truck;
import com.techelevator.TollBoothCalculator.Vehicle;

public class PostageCalculator {

	public static void main(String[] args) {
		
		List<DeliveryDriver> typeOfPostage = new ArrayList<>();
		
		DeliveryDriver postOfficeFirstClass = new PostOfficeFirstClass();
		DeliveryDriver postOfficeSecondClass = new PostOfficeSecondClass();
		DeliveryDriver postOfficeThirdClass = new PostOfficeThirdClass();
		DeliveryDriver fexEd = new FexEd();
		DeliveryDriver spuFourDay = new SPUFourDay();
		DeliveryDriver spuTwoDay = new SPUTwoDay();
		DeliveryDriver spuNextDay = new SPUNextDay();
	    
		typeOfPostage.add(postOfficeFirstClass);
	    typeOfPostage.add(postOfficeSecondClass);
	    typeOfPostage.add(postOfficeThirdClass);
	    typeOfPostage.add(fexEd);
	    typeOfPostage.add(spuFourDay);
	    typeOfPostage.add(spuTwoDay);
	    typeOfPostage.add(spuNextDay);
	    
		while (true) {
			
			Scanner in = new Scanner (System.in);
			
			System.out.print("Please enter the weight of the package: ");
			double weight = in.nextDouble();
			
			System.out.print("Will this be in (P)ounds or (O)unces?: ");
			in.nextLine().toUpperCase();
			String poundsOrOunces = in.nextLine().toUpperCase();
			
			if (poundsOrOunces.equals("P")) {
				weight = weight * 16;
			}	
			
			System.out.print("What distance will it be traveling?: ");
			int distance = in.nextInt();
			
			System.out.println();
			System.out.println("Delivery Method                     Cost");
			System.out.println("----------------------------------------");
			
			for (DeliveryDriver thisPostageType : typeOfPostage) {
				
				if (thisPostageType instanceof PostOfficeFirstClass) {
					System.out.printf("Post Office (1st Class): $%1.2f", thisPostageType.calculateRate(distance, weight));	
					System.out.println();
					}
				if (thisPostageType instanceof PostOfficeSecondClass) {
					System.out.printf("Post Office (2nd Class): $%1.2f", thisPostageType.calculateRate(distance, weight));	
					System.out.println();
				}
				if (thisPostageType instanceof PostOfficeThirdClass) {
					System.out.printf("Post Office (3rd Class): $%1.2f", thisPostageType.calculateRate(distance, weight));	
					System.out.println();
				}
				if (thisPostageType instanceof FexEd) {
					System.out.printf("FexEd: $%1.2f", thisPostageType.calculateRate(distance, weight));	
					System.out.println();
				}
				if (thisPostageType instanceof SPUFourDay) {
					System.out.printf("SPU (4-Day Ground): $%1.2f", thisPostageType.calculateRate(distance, weight));	
					System.out.println();
				}
				if (thisPostageType instanceof SPUTwoDay) {
					System.out.printf("SPU (2-Day Business): $%1.2f", thisPostageType.calculateRate(distance, weight));	
					System.out.println();
				}
				if (thisPostageType instanceof SPUNextDay) {
					System.out.printf("SPU (Next Day) $%1.2f", thisPostageType.calculateRate(distance, weight));	
					System.out.println();
				}
			}
		}
		
	}

}