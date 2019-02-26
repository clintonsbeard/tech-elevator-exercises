package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day10Test {

	private Day10 target;
	
	@Before
	public void setup() {
		target = new Day10();
	}

	@Test
	public void returns_true_if_1s_greater_than_4s() {
		/* Arrange */
		int[] arrayInput = {1, 1, 4};
		/* Act */
		boolean actual = target.more14(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
	@Test
	public void returns_false_if_1s_equal_to_4s() {
		/* Arrange */
		int[] arrayInput = {1, 4};
		/* Act */
		boolean actual = target.more14(arrayInput);
		/* Assert */
		Assert.assertFalse(actual);
	}
	
	@Test
	public void returns_false_if_1s_less_than_4s() {
		/* Arrange */
		int[] arrayInput = {1, 4, 4};
		/* Act */
		boolean actual = target.more14(arrayInput);
		/* Assert */
		Assert.assertFalse(actual);
	}
	
	@Test
	public void returns_false_if_more_negative_1s_than_negative_4s() {
		/* Arrange */
		int[] arrayInput = {-1, -1, -4};
		/* Act */
		boolean actual = target.more14(arrayInput);
		/* Assert */
		Assert.assertFalse(actual);
	}

}