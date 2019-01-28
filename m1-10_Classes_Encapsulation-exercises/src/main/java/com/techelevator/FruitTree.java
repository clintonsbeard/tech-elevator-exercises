package com.techelevator;

public class FruitTree {

	/* Data Members */
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	/* Constructor */
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	/* Getters and Setters */
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}

	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}

	/* Methods */
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (piecesOfFruitLeft > 0) {
			piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
			return true;
		}
		return false;
	}
	
}