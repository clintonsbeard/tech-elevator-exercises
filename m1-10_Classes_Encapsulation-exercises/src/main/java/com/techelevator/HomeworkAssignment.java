package com.techelevator;

public class HomeworkAssignment {

	/* Data Members */
	
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	
	/* Derived Property */
	
	public String getLetterGrade() {
		if ((double) totalMarks / (double) possibleMarks > .9) {
			return "A";
		}
		else if ((double) totalMarks / (double) possibleMarks > .8) {
			return "B";
		}
		else if ((double) totalMarks / (double) possibleMarks > .7) {
			return "C";
		}
		else if ((double) totalMarks / (double) possibleMarks > .6) {
			return "D";
		}
		return "F";
	}
	
	/* Constructor */
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	/* Getters and Setters */
	
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	/* Methods */
	
	/* No methods in this one. */
	
}