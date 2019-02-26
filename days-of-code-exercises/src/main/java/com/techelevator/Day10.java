package com.techelevator;

/* Day 10: More14
Create a boolean method called More14 that takes in an array of type integer “nums”.
Given an array of ints, return true if the number of 1's is greater than the number of 4's.

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true */

public class Day10 {

	public boolean more14(int[] nums) {
		int count1 = 0;
		int count4 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count1++;
			}
			if (nums[i] == 4) {
				count4++;
			}
		}
		if (count1 > count4) {
			return true;
		}
		return false;
	}
	
}