package com.techelevator.PostageCalculator;

public class PostOfficeFirstClass implements DeliveryDriver {
	
	@Override
	public double calculateRate(int distance, double weight) {
		if (weight <= 2) {
			return 0.035 * distance;
		}
		if (weight <= 8) {
			return 0.040 * distance;
		}
		if (weight < 16) {
			return 0.047 * distance;
		}
		if (weight >= 16 && weight <= 48) {
			return 0.195 * distance;
		}
		if (weight <= 128) {
			return 0.450 * distance;
		}
		if (weight > 128) {
			return 0.500 * distance;
		}
	return 0.00;
	}

}