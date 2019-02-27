package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day17Test {

	private Day17 target;
	
	@Before
	public void setup() {
		target = new Day17();
	}

	@Test
	public void it_works() {
		/* Arrange */
		int[] nums = {1, 2, 3};
		int[] expected = {1, 2, 0};
		/* Act */
		int[] actual = target.fix23(nums);
		/* Assert */
		Assert.assertArrayEquals(expected, actual);
	}
	
}