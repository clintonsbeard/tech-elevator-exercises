package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class Lucky13Test {

	private Lucky13 target;
	
	@Before
	public void setup() {
		target = new Lucky13();
	}

	@Test
	public void negative_integers_return_true() {
		/* Arrange */
		int[] nums = {-1, -2, -3};
		/* Act */
		boolean negativeIntegersTest = target.getLucky(nums);
		/* Assert */
		Assert.assertTrue("Didn't assert true", negativeIntegersTest);
	}
	
	@Test
	public void zeroes_return_true() {
		/* Arrange */
		int[] nums = {0, 0, 0};
		/* Act */
		boolean zeroIntegersTest = target.getLucky(nums);
		/* Assert */
		Assert.assertTrue("Didn't assert true", zeroIntegersTest);
	}
	
	@Test
	public void ones_return_false() {
		/* Arrange */
		int[] nums = {1, 2, 2};
		/* Act */
		boolean zeroIntegersTest = target.getLucky(nums);
		/* Assert */
		Assert.assertFalse("Didn't assert false", zeroIntegersTest);
	}
	
	@Test
	public void threes_return_false() {
		/* Arrange */
		int[] nums = {2, 2, 3};
		/* Act */
		boolean zeroIntegersTest = target.getLucky(nums);
		/* Assert */
		Assert.assertFalse("Didn't assert false", zeroIntegersTest);
	}

}