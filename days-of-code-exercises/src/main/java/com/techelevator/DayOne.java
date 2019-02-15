package com.techelevator;

/* Day 1: SwapEnds
Create an integer array method called SwapEnds that takes in an integer array "nums".
Given an array of ints, swap the first and last elements in the array.
Return the modified array. The array length will be at least 1.

For example:
swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8] */

public class DayOne {

	public int[] swapEnds(int[] nums) {
		int firstPlace = 0;
		int lastPlace = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				firstPlace = nums[i];
			}
			if (i == nums.length - 1) {
				lastPlace = nums[i];
				nums[0] = lastPlace;
				nums[i] = firstPlace;
			}
 	    }
		return nums;
	}

}