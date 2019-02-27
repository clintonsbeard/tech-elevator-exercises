package com.techelevator;

/* Day 17: Fix23
Create an integer array called Fix23 that takes in an integer array “nums”.
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
Return the changed array.

fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1] */

public class Day17 {

	public int[] fix23(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums [i + 1] == 3) {
				nums[i + 1] = 0;
			}
		}
		return nums;
	}
	
}