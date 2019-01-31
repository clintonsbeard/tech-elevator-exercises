package com.techelevator.PostageCalculator;

import com.techelevator.TollBoothCalculator.DeliveryDriver;

public class SPUNextDay implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		
		return ((weight * 0.075) * distance) / 16;
	}

}