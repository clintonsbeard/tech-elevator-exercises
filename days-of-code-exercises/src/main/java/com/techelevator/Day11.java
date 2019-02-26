package com.techelevator;

/* Day 11: MakeMiddle
Create an integer array method called MakeMiddle that takes in an integer array “nums”.
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2] */

public class Day11 {

	public int[] makeMiddle(int[] nums) {
		int evenArray[] = new int[2];
		int oddArray[] = new int[1];
		if (nums.length % 2 == 0) {
			int index1 = (nums.length / 2) - 1;
			int index2 = index1 + 1;
			evenArray[0] = nums[index1];
			evenArray[1] = nums[index2];
			return evenArray;
		}
		if (nums.length % 2 == 1) {
			int index = nums.length / 2;
			oddArray[0] = nums[index];
			return oddArray;
		}
		return null;
	}
	
}