package com.techelevator.PostageCalculator;

public class SPUFourDay implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		
		return ((weight * 0.0050) * distance) / 16;
	}

}