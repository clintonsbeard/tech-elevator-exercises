package com.techelevator;

/* Day 3: GreenTicket
Create an integer method called GreenTicket that takes in three integers, "a". "b", and "c"

You have a green lottery ticket, with ints a, b, and c on it.
If the numbers are all different from each other, the result is 0.
If all of the numbers are the same, the result is 20.
If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10 */

public class Day3 {

	public int greenTicket(int int1, int int2, int int3) {
		if (int1 == int2 && int2 == int3) {
			return 20;
		}
		if (int1 == int2 || int2 == int3 || int1 == int3) {
			return 10;
		}
		return 0;
	}
	
}