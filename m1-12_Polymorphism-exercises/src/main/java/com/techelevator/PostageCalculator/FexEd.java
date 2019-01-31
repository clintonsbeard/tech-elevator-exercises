package com.techelevator.PostageCalculator;

import com.techelevator.TollBoothCalculator.DeliveryDriver;

public class FexEd implements DeliveryDriver {

	private String shippingMethod = "FexEd";
	
	public String getShippingMethod() {
		return shippingMethod;
	}
	
	@Override
	public double calculateRate(int distance, double weight) {
		
		double rate = 20.00;
		
		if (distance > 500 && weight > 48) {
			return rate + 8.00;
		}
		else if (distance > 500) {
			return rate + 5.00;
		}
		else if (weight > 48) {
			return rate + 3.00;
		} 
		return rate;
	}

}