package com.techelevator;

/* Day 8:  No23
Create a method of type boolean called No23 that takes in an integer array “nums”.
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false */

public class DayEight {

	public boolean no23(int[] nums) {
		if (nums[0] == 2 || nums[0] == 3 ||
			nums[1] == 2 || nums[1] == 3) {
				return false;
		}
		return true;
	}
	
}