package com.techelevator;

/* Day 12:  MakeLast
Create an integer array method called MakeLast that takes in an integer array “nums”.
Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0.
The original array will be length 1 or more.
Note: by default, a new int array contains all 0's.

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3] */

public class Day12 {

	public int[] makeLast(int[] nums) {
		int newLength = nums.length * 2;
		int newArray[] = new int[newLength];
		for (int i = 0; i < newArray.length; i++) {
			if (i == newArray.length - 1) {
				newArray[i] = nums[nums.length - 1];
			}
			else {
				newArray[i] = 0;
			}
		}
		return newArray;
	}
	
}