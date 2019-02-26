package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day16Test {

	private Day16 target;
	
	@Before
	public void setup() {
		target = new Day16();
	}

	@Test
	public void it_works() {
		/* Arrange */
		int n = 10;
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		/* Act */
		int[] actual = target.fizzArray(n);
		/* Assert */
		Assert.assertArrayEquals(nums, actual);
		/* Arrange */
		n = 1;
		int[] nums2 = {0};
		/* Act */
		int[] actual2 = target.fizzArray(n);
		/* Assert */
		Assert.assertArrayEquals(nums2, actual2);
		/* Arrange */
		n = 0;
		int[] nums3 = {};
		/* Act */
		int[] actual3 = target.fizzArray(n);
		/* Assert */
		Assert.assertArrayEquals(nums3, actual3);
	}
	
}