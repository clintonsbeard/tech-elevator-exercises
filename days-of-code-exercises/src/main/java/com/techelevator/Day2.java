package com.techelevator;

/* Day 2: Has12
Create a boolean method called Has12 that takes in an integer array "nums".
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

For example:
has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true

(There are many possible solutions. Here is a challenge -  can you do this by looping through the array only once?)
(Already solved this problem? Too bad, solve it again. Better.) */

public class Day2 {

	public boolean has12(int[] nums) {
		boolean has1 = false;
		boolean has2 = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[0] == 1) {
				has1 = true;
			}
			if (i == 1 && nums[i - 1] != 2) {
				if (nums[i] == 1) {
				has1 = true;
				}
			}
			if (nums[i] == 2) {
				has2 = true;
			}
 	    }
		if (has1 && has2) {
			return true;
		}
		return false;
	}
	
}