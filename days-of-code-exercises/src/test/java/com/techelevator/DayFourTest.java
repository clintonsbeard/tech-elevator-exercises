package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DayFourTest {

	private DayFour target;
	
	@Before
	public void setup() {
		target = new DayFour();
	}

	@Test
	public void returns_2_if_both_start_with_1() {
		/* Arrange */
		int[] dayFourArray1 = {1, 2, 3};
		int[] dayFourArray2 = {1, 2};
		/* Act */
		int actual = target.start1(dayFourArray1, dayFourArray2);
		/* Assert */
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void returns_1_if_only_one_starts_with_1() {
		/* Arrange */
		int[] dayFourArray1 = {1, 2, 3};
		int[] dayFourArray2 = {2, 2};
		/* Act */
		int actual = target.start1(dayFourArray1, dayFourArray2);
		/* Assert */
		Assert.assertEquals(1, actual);
		/* Arrange */
		int[] dayFourArray3 = {2, 2, 3};
		int[] dayFourArray4 = {1, 2};
		/* Act */
		actual = target.start1(dayFourArray3, dayFourArray4);
		/* Assert */
		Assert.assertEquals(1, actual);
	}
	
	@Test
	public void returns_0_if_neither_start_with_1() {
		/* Arrange */
		int[] dayFourArray1 = {2, 2, 3};
		int[] dayFourArray2 = {2, 2};
		/* Act */
		int actual = target.start1(dayFourArray1, dayFourArray2);
		/* Assert */
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void returns_0_if_both_start_with_negative_1() {
		/* Arrange */
		int[] dayFourArray1 = {-1, 2, 3};
		int[] dayFourArray2 = {-1, 2};
		/* Act */
		int actual = target.start1(dayFourArray1, dayFourArray2);
		/* Assert */
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void returns_1_if_one_starts_with_negative_1_and_one_starts_with_positive_1() {
		/* Arrange */
		int[] dayFourArray1 = {-1, 2, 3};
		int[] dayFourArray2 = {1, 2};
		/* Act */
		int actual = target.start1(dayFourArray1, dayFourArray2);
		/* Assert */
		Assert.assertEquals(1, actual);
	}
}