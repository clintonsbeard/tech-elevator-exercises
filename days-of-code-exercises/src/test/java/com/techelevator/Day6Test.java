package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day6Test {

	private Day6 target;
	
	@Before
	public void setup() {
		target = new Day6();
	}

	@Test
	public void returns_true_if_only_1s_or_4s() {
		/* Arrange */
		int[] arrayInput = {1, 4, 1, 4};
		/* Act */
		boolean actual = target.only14(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
	@Test
	public void returns_false_if_not_a_1_or_4() {
		/* Arrange */
		int[] arrayInput = {1, 4, 2, 4};
		/* Act */
		boolean actual = target.only14(arrayInput);
		/* Assert */
		Assert.assertFalse(actual);
	}
	
	@Test
	public void returns_false_if_negative() {
		/* Arrange */
		int[] arrayInput = {-1, -4, 1, 4};
		/* Act */
		boolean actual = target.only14(arrayInput);
		/* Assert */
		Assert.assertFalse(actual);
	}
	
	@Test
	public void returns_false_if_zeroes() {
		/* Arrange */
		int[] arrayInput = {0, 4, 1, 4};
		/* Act */
		boolean actual = target.only14(arrayInput);
		/* Assert */
		Assert.assertFalse(actual);
	}
	
}