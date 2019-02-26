package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day12Test {

	private Day12 target;
	
	@Before
	public void setup() {
		target = new Day12();
	}

	@Test
	public void returns_true_if_returns_middle_even() {
		/* Arrange */
		int[] arrayInput = {4, 5, 6};
		int[] expected = {0, 0, 0, 0, 0, 6};
		/* Act */
		int[] actual = target.makeLast(arrayInput);
		/* Assert */
		Assert.assertArrayEquals(expected, actual);
		/* Arrange */
		int[] arrayInput2 = {1, 2};
		int[] expected2 = {0, 0, 0, 2};
		/* Act */
		int[] actual2 = target.makeLast(arrayInput2);
		/* Assert */
		Assert.assertArrayEquals(expected2, actual2);
		/* Arrange */
		int[] arrayInput3 = {3};
		int[] expected3 = {0, 3};
		/* Act */
		int[] actual3 = target.makeLast(arrayInput3);
		/* Assert */
		Assert.assertArrayEquals(expected3, actual3);
	}
	
}