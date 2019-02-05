package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class SameFirstLastTest {

	private SameFirstLast target;
	
	@Before
	public void setup() {
		target = new SameFirstLast();
	}

	@Test
	public void empty_array_returns_false() {
		/* Arrange */
		int[] nums = new int[]{};
		/* Act */
		boolean type = target.isItTheSame(nums);
		/* Assert */
		Assert.assertFalse(type);
	}
	
	@Test
	public void negative_integers_return_true() {
		/* Arrange */
		int[] nums = new int[]{-6, 1, -6};
		/* Act */
		boolean type = target.isItTheSame(nums);
		/* Assert */
		Assert.assertTrue(type);
	}
	
	@Test
	public void negative_and_positive_of_the_same_integer_return_false() {
		/* Arrange */
		int[] nums = new int[]{6, 1, -6};
		/* Act */
		boolean type = target.isItTheSame(nums);
		/* Assert */
		Assert.assertFalse(type);
	}
	
}