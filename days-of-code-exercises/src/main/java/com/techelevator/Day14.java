package com.techelevator;

/* Day 14: LessBy10
Create a boolean method called LessBy10 that take in three integers, “a, “b”, and “c”.
Given three ints, a b c, return true if one of them is 10 or more different than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true */

public class Day14 {

	public boolean lessBy10(int a, int b, int c) {
		if (a >= b + 10 || b >= a + 10 || a >= c + 10 ||
			c >= a + 10 || b >= c + 10 || c >= b + 10) {
			return true;
		}
		return false;
	}
	
}