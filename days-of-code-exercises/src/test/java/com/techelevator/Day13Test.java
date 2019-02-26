package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day13Test {

	private Day13 target;
	
	@Before
	public void setup() {
		target = new Day13();
	}

	@Test
	public void method_returns_expected() {
		/* Arrange */
		int[] arrayInput = {1, 2, 3};
		int[] expected = {1, 3};
		/* Act */
		int[] actual = target.makeEnds(arrayInput);
		/* Assert */
		Assert.assertArrayEquals(expected, actual);
		/* Arrange */
		int[] arrayInput2 = {1, 2, 3, 4};
		int[] expected2 = {1, 4};
		/* Act */
		int[] actual2 = target.makeEnds(arrayInput2);
		/* Assert */
		Assert.assertArrayEquals(expected2, actual2);
		/* Arrange */
		int[] arrayInput3 = {7, 4, 6, 2};
		int[] expected3 = {7, 2};
		/* Act */
		int[] actual3 = target.makeEnds(arrayInput3);
		/* Assert */
		Assert.assertArrayEquals(expected3, actual3);
	}
	
	@Test
	public void returns_single_number_twice() {
		/* Arrange */
		int[] arrayInput = {1};
		int[] expected = {1, 1};
		/* Act */
		int[] actual = target.makeEnds(arrayInput);
		/* Assert */
		Assert.assertArrayEquals(expected, actual);
	}
	
}