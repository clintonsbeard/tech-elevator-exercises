package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DayEightTest {

	private DayEight target;
	
	@Before
	public void setup() {
		target = new DayEight();
	}

	@Test
	public void returns_true_if_no_2s_or_3s() {
		/* Arrange */
		int[] arrayInput = {4, 5};
		/* Act */
		boolean actual = target.no23(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
	@Test
	public void returns_false_if_2s_or_3s() {
		/* Arrange */
		int[] arrayInput = {4, 2};
		/* Act */
		boolean actual = target.no23(arrayInput);
		/* Assert */
		Assert.assertFalse(actual);
		/* Arrange */
		int[] arrayInput2 = {3, 5};
		/* Act */
		boolean actual2 = target.no23(arrayInput2);
		/* Assert */
		Assert.assertFalse(actual2);
	}
	
	@Test
	public void returns_true_if_negative_2s_or_3s() {
		/* Arrange */
		int[] arrayInput = {-2, -3};
		/* Act */
		boolean actual = target.no23(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
	@Test
	public void returns_true_if_zeroes() {
		/* Arrange */
		int[] arrayInput = {0, 1};
		/* Act */
		boolean actual = target.no23(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
	@Test
	public void returns_true_if_negative_non_2s_and_3s() {
		/* Arrange */
		int[] arrayInput = {-1, -4};
		/* Act */
		boolean actual = target.no23(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
}