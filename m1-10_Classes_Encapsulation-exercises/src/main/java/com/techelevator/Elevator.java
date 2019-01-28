package com.techelevator;

public class Elevator {

	/* Data Members */
	
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	
	/* Derived Property */
	
	/* No derived properties needed (defualt). */
	
	/* Constructor */
	
	public Elevator(int totalNumberOfFloors) {
		this.numberOfFloors = totalNumberOfFloors;
		this.currentFloor = 1;
	}
	
	/* Getters and Setters */
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}

	/* Methods */
	
	public void openDoor() {
		doorOpen = true;
	}
    public void closeDoor() {
    	doorOpen = false;
    }
    public void goUp(int desiredFloor) {
    	if (doorOpen == true) {
    		currentFloor = currentFloor;
    	}
    	if (doorOpen == false && desiredFloor > currentFloor && desiredFloor <= numberOfFloors) {
			currentFloor = desiredFloor;
		}
    }
    public void goDown(int desiredFloor) {
    	if (doorOpen == true) {
    		currentFloor = currentFloor;
    	}
    	if (doorOpen == false && desiredFloor < currentFloor && desiredFloor >= 1) {
    		currentFloor = desiredFloor;
    	}
    }
	
}