package com.techelevator.personalprojects.rentcalculator;

import java.math.BigDecimal;

public class RentCalculatorMath {

	private BigDecimal gasBill;
	private BigDecimal electricBill;
	private BigDecimal huluBill = new BigDecimal(12.87);
	private BigDecimal grangeBill = new BigDecimal(25.25);
	private BigDecimal netflixBill = new BigDecimal(11.81);
	private BigDecimal internetBill = new BigDecimal(55.74);
	private BigDecimal halfOfMonthlyRent = new BigDecimal(392.50);
	
	public BigDecimal getGasBill() {
		return gasBill;
	}
	public void setGasBill(BigDecimal gasBill) {
		this.gasBill = gasBill;
	}
	
	public BigDecimal getElectricBill() {
		return electricBill;
	}
	public void setElectricBill(BigDecimal electricBill) {
		this.electricBill = electricBill;
	}
	
	public BigDecimal getHuluBill() {
		return huluBill;
	}
	public BigDecimal getGrangeBill() {
		return grangeBill;
	}
	public BigDecimal getNetflixBill() {
		return netflixBill;
	}
	public BigDecimal getInternetBill() {
		return internetBill;
	}
	public BigDecimal getHalfOfMonthlyRent() {
		return halfOfMonthlyRent;
	}
	
	public BigDecimal getTotalBills() {
		return electricBill.add(gasBill).add(internetBill).add(huluBill).add(netflixBill).add(grangeBill);
	}
	public BigDecimal getHalfOfTotalBills() {
		return getTotalBills().divide(new BigDecimal(2));
	}
	public BigDecimal getLexiRent() {
		return getHalfOfMonthlyRent().add(getHalfOfTotalBills());
	}
	public BigDecimal getClintonRent() {
		return getHalfOfMonthlyRent().subtract(getHalfOfTotalBills());
	}
	
	
}