package com.techelevator;

public class Television {

	/* Data Members */
	
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	
	/* Derived Property */
	
	/* No derived properties needed. */
	
	/* Constructor */
	
	public Television() {
		isOn = false;
		currentChannel = 3;
		currentVolume = 2;
	}
	
	/* Getters and Setters */
	
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}

	/* Methods */
	
	public void turnOff() {
		isOn = false;
	}
	public void turnOn() {
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}
	public void changeChannel(int newChannel) {
		if (isOn == true && newChannel >= 3 && newChannel <= 18) {
			currentChannel = newChannel;
		}
	}
	public void channelUp() {
		if (isOn == true && currentChannel >= 3 && currentChannel < 18) {
			currentChannel = currentChannel + 1;
		}
		else if (isOn == true && currentChannel == 18) {
			currentChannel = 3;
		}
	}
	public void channelDown() {
		if (isOn == true && currentChannel > 3 && currentChannel <= 18) {
			currentChannel = currentChannel - 1;
		}
		else if (isOn == true && currentChannel == 3) {
			currentChannel = 18;
		}
	}
	public void raiseVolume() {
		if (isOn == true && currentVolume < 10) {
			currentVolume = currentVolume + 1;
		}
	}
	public void lowerVolume() {
		if (isOn == true && currentVolume > 0) {
			currentVolume = currentVolume - 1;
		}
	}
	 
}