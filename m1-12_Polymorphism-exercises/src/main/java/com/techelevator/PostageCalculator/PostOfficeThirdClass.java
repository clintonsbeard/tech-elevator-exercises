package com.techelevator.PostageCalculator;

import com.techelevator.TollBoothCalculator.DeliveryDriver;

public class PostOfficeThirdClass implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		
		if (weight <= 2) {
			return 0.0020 * distance;
		}
		if (weight <= 8) {
			return 0.0022 * distance;
		}
		if (weight < 16) {
			return 0.0024 * distance;
		}
		if (weight >= 16 && weight <= 48) {
			return 0.0150 * distance;
		}
		if (weight <= 128) {
			return 0.0160 * distance;
		}
		if (weight > 128) {
			return 0.0170 * distance;
		}
	return 0.00;
	}

}