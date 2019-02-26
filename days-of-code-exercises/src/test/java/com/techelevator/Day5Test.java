package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day5Test {

	private Day5 target;
	
	@Before
	public void setup() {
		target = new Day5();
	}

	@Test
	public void returns_expected_array() {
		/* Arrange */
		int dayFiveArrayStart = 5;
		int dayFiveArrayEnd = 10;
		int[] expectedArray = {5, 6, 7, 8, 9};
		/* Act */
		int[] actualArray = target.fizzArray3(dayFiveArrayStart, dayFiveArrayEnd);
		/* Assert */
		Assert.assertArrayEquals(expectedArray, actualArray);
		/* Arrange */
		dayFiveArrayStart = 11;
		dayFiveArrayEnd = 18;
		int[] expectedArray2 = {11, 12, 13, 14, 15, 16, 17};
		/* Act */
		int[] actualArray2 = target.fizzArray3(dayFiveArrayStart, dayFiveArrayEnd);
		/* Assert */
		Assert.assertArrayEquals(expectedArray2, actualArray2);
		/* Arrange */
		dayFiveArrayStart = 1;
		dayFiveArrayEnd = 3;
		int[] expectedArray3 = {1, 2};
		/* Act */
		int[] actualArray3 = target.fizzArray3(dayFiveArrayStart, dayFiveArrayEnd);
		/* Assert */
		Assert.assertArrayEquals(expectedArray3, actualArray3);
	}
	
	@Test
	public void array_length_zero_returns_expected_array() {
		/* Arrange */
		int dayFiveArrayStart = 0;
		int dayFiveArrayEnd = 0;
		int[] expectedArray = {};
		/* Act */
		int[] actualArray = target.fizzArray3(dayFiveArrayStart, dayFiveArrayEnd);
		/* Assert */
		Assert.assertArrayEquals(expectedArray, actualArray);
	}
	
	@Test
	public void negative_integers_return_expected_array() {
		/* Arrange */
		int dayFiveArrayStart = -1;
		int dayFiveArrayEnd = -3;
		int[] expectedArray = {-1, -2};
		/* Act */
		int[] actualArray = target.fizzArray3(dayFiveArrayStart, dayFiveArrayEnd);
		/* Assert */
		Assert.assertArrayEquals(expectedArray, actualArray);
	}
	
	@Test
	public void zero_to_positive_returns_expected_array() {
		/* Arrange */
		int dayFiveArrayStart = 0;
		int dayFiveArrayEnd = 3;
		int[] expectedArray = {0, 1, 2};
		/* Act */
		int[] actualArray = target.fizzArray3(dayFiveArrayStart, dayFiveArrayEnd);
		/* Assert */
		Assert.assertArrayEquals(expectedArray, actualArray);
	}
	
	@Test
	public void zero_to_negative_returns_expected_array() {
		/* Arrange */
		int dayFiveArrayStart = 0;
		int dayFiveArrayEnd = -3;
		int[] expectedArray = {0, -1, -2};
		/* Act */
		int[] actualArray = target.fizzArray3(dayFiveArrayStart, dayFiveArrayEnd);
		/* Assert */
		Assert.assertArrayEquals(expectedArray, actualArray);
	}
	
	@Test
	public void negative_to_positive_returns_expected_array() {
		/* Arrange */
		int dayFiveArrayStart = -1;
		int dayFiveArrayEnd = 3;
		int[] expectedArray = {-1, 0, 1, 2};
		/* Act */
		int[] actualArray = target.fizzArray3(dayFiveArrayStart, dayFiveArrayEnd);
		/* Assert */
		Assert.assertArrayEquals(expectedArray, actualArray);
	}
	
}