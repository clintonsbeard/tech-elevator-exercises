package com.techelevator.PostageCalculator;

import com.techelevator.TollBoothCalculator.DeliveryDriver;

public class SPUTwoDay implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		
		return ((weight * 0.050) * distance) / 16;
	}

}