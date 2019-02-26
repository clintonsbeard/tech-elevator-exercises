package com.techelevator;

/* Day 15:  Has23
Create a boolean method called Has23 that takes in an integer array “nums”.
Given an int array length 2, return true if it contains a 2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false */

public class Day15 {
	
	public boolean has23(int[] nums) {
		if (nums[0] == 2 || nums[0] == 3 ||
			nums[1] == 2 || nums[1] == 3) {
				return true;
		}
		return false;
	}
	
}