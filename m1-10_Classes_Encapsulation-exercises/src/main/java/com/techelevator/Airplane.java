package com.techelevator;

public class Airplane {

	/* Data Members */
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	
	/* Derived Property */
	
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	
	/* Constructor */
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	
	/* Getters and Setters */
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}

	/* Methods */
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if (forFirstClass == true && this.getAvailableFirstClassSeats() > 0) {
			if (totalNumberOfSeats < this.getAvailableFirstClassSeats()) {
				bookedFirstClassSeats = bookedFirstClassSeats + totalNumberOfSeats;
				return true;
			}
			return false;
		}
		if (forFirstClass == false && this.getAvailableCoachSeats() > 0) {
			if (totalNumberOfSeats < this.getAvailableCoachSeats()) {
				bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
				return true;
			}
			return false;
		}
		return false;
	}
	
}