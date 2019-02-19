package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DayNineTest {

	private DayNine target;
	
	@Before
	public void setup() {
		target = new DayNine();
	}

	@Test
	public void returns_true_if_no_1s_or_4s() {
		/* Arrange */
		int[] arrayInput = {6, 5};
		/* Act */
		boolean actual = target.no14(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
	@Test
	public void returns_false_if_1s_or_4s() {
		/* Arrange */
		int[] arrayInput = {4, 2};
		/* Act */
		boolean actual = target.no14(arrayInput);
		/* Assert */
		Assert.assertFalse(actual);
		/* Arrange */
		int[] arrayInput2 = {1, 5};
		/* Act */
		boolean actual2 = target.no14(arrayInput2);
		/* Assert */
		Assert.assertFalse(actual2);
	}
	
	@Test
	public void returns_true_if_negative_1s_or_4s() {
		/* Arrange */
		int[] arrayInput = {-1, -4};
		/* Act */
		boolean actual = target.no14(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
	@Test
	public void returns_true_if_zeroes() {
		/* Arrange */
		int[] arrayInput = {0, 2};
		/* Act */
		boolean actual = target.no14(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
	@Test
	public void returns_true_if_negative_non_1s_and_4s() {
		/* Arrange */
		int[] arrayInput = {-2, -3};
		/* Act */
		boolean actual = target.no14(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
}