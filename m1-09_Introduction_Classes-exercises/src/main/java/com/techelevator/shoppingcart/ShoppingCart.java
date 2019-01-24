package com.techelevator.shoppingcart;

public class ShoppingCart {

	/* Data Members */
	
	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	/* Getters and Setters */
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}

	/* Methods */
	
	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems += numberOfItems;
		totalAmountOwed += (pricePerItem * numberOfItems);
	}
	public double getAveragePricePerItem() {
		if (totalNumberOfItems == 0) {
			return 0;
		}
		return totalAmountOwed / totalNumberOfItems;
	}
	public void empty() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0.0;
	}
	
}