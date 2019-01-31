package com.techelevator.TollBoothCalculator;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {

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
    
    int totalDistance = 0;
    double totalTollBoothRevenue = 0.00;
    
    System.out.println("Vehicle               Distance Traveled (mi)    Toll ($)");
    System.out.println("--------------------------------------------------------");
    
    for (Vehicle thisVehicle : typeOfVehicle) {
        int distance = (int)((Math.random() * 230) + 10);
        totalDistance += distance;
        
        if (thisVehicle instanceof Car) {
        	if ( ((Car) thisVehicle).isHasTrailer() ) {
            	System.out.print("Car (With Trailer): ");
            	System.out.printf("%2s%-1s%23s", "", distance, "");
            	System.out.printf("$%-3.2f", thisVehicle.calculateToll(distance));
                System.out.println();
            } else if ( !((Car) thisVehicle).isHasTrailer() ) {
            	System.out.print("Car (No Trailer): ");
            	System.out.printf("%4s%-1s%23s", "", distance, "");
            	System.out.printf("$%-3.2f", thisVehicle.calculateToll(distance));
                System.out.println();
            }
        } if (thisVehicle instanceof Tank) {
        	System.out.print("Tank: ");
        	System.out.printf("%16s%-1s%23s", "", distance, "");
        	System.out.printf("$%-3.2f", thisVehicle.calculateToll(distance));
            System.out.println();
        } if (thisVehicle instanceof Truck) {
        	if (((Truck) thisVehicle).getNumberOfAxles() == 4) {
        		System.out.print("Truck (4 Axles): ");
        		System.out.printf("%5s%-1s%23s", "", distance, "");
            	System.out.printf("$%-3.2f", thisVehicle.calculateToll(distance));
                System.out.println();
            } if (((Truck) thisVehicle).getNumberOfAxles() == 6) {
            	System.out.print("Truck (6 Axles): ");
            	System.out.printf("%5s%-1s%23s", "", distance, "");
            	System.out.printf("$%-3.2f", + thisVehicle.calculateToll(distance));
                System.out.println();
            } if (((Truck) thisVehicle).getNumberOfAxles() >= 8) {
            	System.out.print("Truck (8 Axles): ");
            	System.out.printf("%5s%-1s%23s", "", distance, "");
            	System.out.printf("$%-3.2f", thisVehicle.calculateToll(distance));
                System.out.println();
            }
        }
        totalTollBoothRevenue += thisVehicle.calculateToll(distance);
    }
    System.out.println("--------------------------------------------------------");
    System.out.print("Total Miles Traveled: " + totalDistance);
    System.out.printf("       Total Revenue: $%3.2f", totalTollBoothRevenue);
	}

}