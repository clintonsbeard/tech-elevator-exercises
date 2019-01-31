package com.techelevator.TollBoothCalculator;

public class Truck implements Vehicle {

	/* Data Members */
	
	private int numberOfAxles;

	/* Constructor */
	
	public Truck(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}
	
	/* Getters and Setters */
	
	public int getNumberOfAxles() {
		return numberOfAxles;
	}
	
	@Override
	public double calculateToll(int distance) {
		 if (getNumberOfAxles() <= 4) {
			 return 0.040 * distance;
		 }
		 if (getNumberOfAxles() == 6) {
			 return 0.045 * distance;
		 }
		 return 0.048 * distance;
	}

}