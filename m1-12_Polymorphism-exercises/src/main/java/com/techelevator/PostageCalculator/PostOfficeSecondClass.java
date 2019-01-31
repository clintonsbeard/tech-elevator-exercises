package com.techelevator.PostageCalculator;

import com.techelevator.TollBoothCalculator.DeliveryDriver;

public class PostOfficeSecondClass implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		
		if (weight <= 2) {
			return 0.0035 * distance;
		}
		if (weight <= 8) {
			return 0.0040 * distance;
		}
		if (weight < 16) {
			return 0.0047 * distance;
		}
		if (weight >= 16 && weight <= 48) {
			return 0.0195 * distance;
		}
		if (weight <= 128) {
			return 0.0450 * distance;
		}
		if (weight > 128) {
			return 0.0500 * distance;
		}
	return 0.00;
	}

}