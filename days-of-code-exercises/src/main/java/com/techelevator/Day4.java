package com.techelevator;

/* Day 4: Start1
Create an integer method called Start1 that takes in two integer arrays "a" and "b".
Start with 2 int arrays, a and b, of any length.
Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], ) → 1 */

public class Day4 {

	public int start1(int[] a, int[] b) {
		if (a[0] == 1 && b[0] == 1) {
			return 2;
		}
		if (a[0] == 1 || b[0] == 1) {
			return 1;
		}
		return 0;
	}
	
}