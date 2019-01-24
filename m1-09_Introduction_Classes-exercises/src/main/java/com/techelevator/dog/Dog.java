package com.techelevator.dog;

public class Dog {

	/* Data Members */
	
	private boolean sleeping;
	
	/* Getters and Setters */
	
	public boolean isSleeping() {
		return sleeping;
	}
	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}

	/* Methods */
	
	public String makeSound() {
		if (sleeping == true) {
			return "Zzzzz...";
		}
		if (sleeping == false) {
			return "Woof!";
		}
		return null;
	}
	public void sleep() {
		sleeping = true;
	}
	public void wakeUp() {
		sleeping = false;
	}
	
}
