package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DayTwoTest {

	private DayTwo target;
	
	@Before
	public void setup() {
		target = new DayTwo();
	}

	@Test
	public void returns_true_if_1_then_2() {
		/* Arrange */
		int[] dayTwoArray = {1, 3, 2};
		int[] dayTwoArray2 = {3, 1, 2};
		int[] dayTwoArray3 = {3, 1, 4, 5, 2};
		/* Act */
		boolean dayTwoActual = target.has12(dayTwoArray);
		boolean dayTwoActual2 = target.has12(dayTwoArray);
		boolean dayTwoActual3 = target.has12(dayTwoArray);
		/* Assert */
		Assert.assertTrue(dayTwoActual);
		Assert.assertTrue(dayTwoActual2);
		Assert.assertTrue(dayTwoActual3);
	}
	
	@Test
	public void returns_false_if_2_then_1() {
		/* Arrange */
		int[] dayTwoArray = {3, 2, 1};
		/* Act */
		boolean dayTwoActual = target.has12(dayTwoArray);
		/* Assert */
		Assert.assertFalse(dayTwoActual);
	}
	
	@Test
	public void returns_false_if_negative_2_or_negative_1() {
		/* Arrange */
		int[] dayTwoArray = {-1, -2, 3};
		/* Act */
		boolean dayTwoActual = target.has12(dayTwoArray);
		/* Assert */
		Assert.assertFalse(dayTwoActual);
	}
	
}