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
		
		List<Vehicle> typeOfVehicle = new ArrayList<>();
	    
	    Vehicle carWithNoTrailer = new Car(false);
	    Vehicle carWithTrailer = new Car(true);
	    Vehicle tank = new Tank();
	    Vehicle truckWith4Axles = new Truck(4);
	    Vehicle truckWith6Axles = new Truck(6);
	    Vehicle truckWith8Axles = new Truck(8);
	    
	    typeOfVehicle.add(carWithNoTrailer);
	    typeOfVehicle.add(carWithTrailer);
	    typeOfVehicle.add(tank);
	    typeOfVehicle.add(truckWith4Axles);
	    typeOfVehicle.add(truckWith6Axles);
	    typeOfVehicle.add(truckWith8Axles);
	    
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
			
			System.out.println("Post Office (1st Class): " + thisVehicle.calculateToll(distance));
		}
		
	}

}