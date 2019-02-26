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
		int n = 4;
		int[] nums = {0, 1, 2, 3};
		/* Act */
		int[] actual = target.fizzArray(n);
		/* Assert */
		Assert.assertArrayEquals(nums, actual);
	}
	
}