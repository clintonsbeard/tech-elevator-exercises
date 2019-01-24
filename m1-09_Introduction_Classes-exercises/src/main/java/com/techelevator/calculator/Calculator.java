package com.techelevator.calculator;

public class Calculator {

	/* Data Members */
	
	private int currentValue;
	
	/* Getters and Setters */
	
	public int getCurrentValue() {
		return currentValue;
	}

	/* Methods */
	
	public void reset() {
    	currentValue = 0;
    }
	public int add(int addend) {
		return currentValue = currentValue + addend;
	}
    public int multiply(int multiplier) {
    	return currentValue = currentValue * multiplier;
    }
    public int subtract(int subtrahend) {
    	return currentValue = currentValue - subtrahend;
    }
    public int power(int exponent) {
    	for (int i = 1; i < exponent; i++) {
    		currentValue = currentValue * currentValue;
    	}
    	return currentValue;
    }
    
	
}