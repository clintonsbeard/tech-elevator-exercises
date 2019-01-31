package com.techelevator.TollBoothCalculator;

public class Car implements Vehicle {

	/* Data Members */
	
	private boolean hasTrailer;

	/* Constructor */
	
	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}
	
	/* Getters and Setters */
	
	public boolean isHasTrailer() {
		return hasTrailer;
	}

	@Override
	public double calculateToll(int distance) {
		if (isHasTrailer()) {
			return (distance * 0.020) + 1;
		}
		return distance * 0.020;
	}
	
}