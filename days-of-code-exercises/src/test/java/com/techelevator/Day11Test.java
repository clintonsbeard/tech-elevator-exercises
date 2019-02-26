package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day11Test {

	private Day11 target;
	
	@Before
	public void setup() {
		target = new Day11();
	}

	@Test
	public void returns_true_if_returns_middle_even() {
		/* Arrange */
		int[] arrayInput = {1, 2};
		int[] expected = {1, 2};
		/* Act */
		int[] actual = target.makeMiddle(arrayInput);
		/* Assert */
		Assert.assertArrayEquals(expected, actual);
		/* Arrange */
		int[] arrayInput2 = {1, 2, 3, 4};
		int[] expected2 = {2, 3};
		/* Act */
		int[] actual2 = target.makeMiddle(arrayInput2);
		/* Assert */
		Assert.assertArrayEquals(expected2, actual2);
		/* Arrange */
		int[] arrayInput3 = {7, 1, 2, 3, 4, 9};
		int[] expected3 = {2, 3};
		/* Act */
		int[] actual3 = target.makeMiddle(arrayInput3);
		/* Assert */
		Assert.assertArrayEquals(expected3, actual3);
	}
	
	@Test
	public void returns_true_if_returns_middle_odd() {
		/* Arrange */
		int[] arrayInput = {1, 2, 3};
		int[] expected = {2};
		/* Act */
		int[] actual = target.makeMiddle(arrayInput);
		/* Assert */
		Assert.assertArrayEquals(expected, actual);
		/* Arrange */
		int[] arrayInput2 = {1, 2, 3, 4, 5};
		int[] expected2 = {3};
		/* Act */
		int[] actual2 = target.makeMiddle(arrayInput2);
		/* Assert */
		Assert.assertArrayEquals(expected2, actual2);
		/* Arrange */
		int[] arrayInput3 = {1, 2, 3, 4, 5, 6, 7};
		int[] expected3 = {4};
		/* Act */
		int[] actual3 = target.makeMiddle(arrayInput3);
		/* Assert */
		Assert.assertArrayEquals(expected3, actual3);
	}
	
}