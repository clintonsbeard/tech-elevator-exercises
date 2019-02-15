package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DayOneTest {

	private DayOne target;
	
	@Before
	public void setup() {
		target = new DayOne();
	}

	@Test
	public void positive_number_swap() {
		/* Arrange */
		int[] dayOneArray = {1, 2, 3, 4};
		int[] dayOneExpected = {4, 2, 3, 1};
		/* Act */
		int[] dayOneActual = target.swapEnds(dayOneArray);
		/* Assert */
		Assert.assertArrayEquals(dayOneExpected, dayOneActual);
	}
	
	@Test
	public void negative_number_swap() {
		/* Arrange */
		int[] dayOneArray = {-1, -2, -3, -4};
		int[] dayOneExpected = {-4, -2, -3, -1};
		/* Act */
		int[] dayOneActual = target.swapEnds(dayOneArray);
		/* Assert */
		Assert.assertArrayEquals(dayOneExpected, dayOneActual);
	}
	
	@Test
	public void zero_number_swap() {
		/* Arrange */
		int[] dayOneArray = {0, 2, 3, 4};
		int[] dayOneExpected = {4, 2, 3, 0};
		/* Act */
		int[] dayOneActual = target.swapEnds(dayOneArray);
		/* Assert */
		Assert.assertArrayEquals(dayOneExpected, dayOneActual);
	}
	
}