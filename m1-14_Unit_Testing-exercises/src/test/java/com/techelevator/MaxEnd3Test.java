package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MaxEnd3Test {

	private MaxEnd3 target;
	
	@Before
	public void setup() {
		target = new MaxEnd3();
	}

	@Test
	public void positive_integers_return_expected_result() {
		/* Arrange */
		int[] nums = new int[]{4, 1, 0};
		int[] expectedNums = new int[]{4, 4, 4};
		/* Act */
		int[] positiveIntegersTest = target.makeArray(nums);
		/* Assert */
		Assert.assertEquals(expectedNums, positiveIntegersTest);
	}
	
	@Test
	public void same_integers_return_expected_result() {
		/* Arrange */
		int[] nums = new int[]{4, 1, 4};
		int[] expectedNums = new int[]{4, 4, 4};
		/* Act */
		int[] sameIntegersTest = target.makeArray(nums);
		/* Assert */
		Assert.assertEquals(expectedNums, sameIntegersTest);
	}
	
	@Test
	public void negative_integers_return_expected_result() {
		/* Arrange */
		int[] nums = new int[]{-1, -2, -3};
		int[] expectedNums = new int[]{-1, -1, -1};
		/* Act */
		int[] negativeIntegersTest = target.makeArray(nums);
		/* Assert */
		Assert.assertEquals(expectedNums, negativeIntegersTest);
	}
	
	@Test
	public void zeroes_return_expected_result() {
		/* Arrange */
		int[] nums = new int[]{0, -1, -3};
		int[] expectedNums = new int[]{0, 0, 0};
		/* Act */
		int[] zeroIntegerTest = target.makeArray(nums);
		/* Assert */
		Assert.assertEquals(expectedNums, zeroIntegerTest);
	}

}