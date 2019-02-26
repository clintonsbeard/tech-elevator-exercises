package com.techelevator;

/* Day 9:  No14
Create a boolean method called No14 that takes in an integer array “nums”.
Given an array of ints, return true if it contains no 1's and it contains no 4's.

no14([7, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → false */

public class Day9 {

	public boolean no14(int[] nums) {
		if (nums[0] == 1 || nums[0] == 4 ||
			nums[1] == 1 || nums[1] == 4) {
				return false;
		}
		return true;
	}
	
}