package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DayThreeTest {

	private DayThree target;
	
	@Before
	public void setup() {
		target = new DayThree();
	}

	@Test
	public void returns_0_if_all_are_different() {
		/* Arrange */
		int int1 = 0;
		int int2 = 1;
		int int3 = 2;
		/* Act */
		int actual = target.greenTicket(int1, int2, int3);
		/* Assert */
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void returns_10_if_two_are_the_same() {
		/* Arrange */
		int int1 = 1;
		int int2 = 1;
		int int3 = 2;
		/* Act */
		int actual = target.greenTicket(int1, int2, int3);
		/* Assert */
		Assert.assertEquals(10, actual);
		
		/* Arrange */
		int1 = 1;
		int2 = 2;
		int3 = 1;
		/* Act */
		actual = target.greenTicket(int1, int2, int3);
		/* Assert */
		Assert.assertEquals(10, actual);
		
		/* Arrange */
		int1 = 2;
		int2 = 1;
		int3 = 1;
		/* Act */
		actual = target.greenTicket(int1, int2, int3);
		/* Assert */
		Assert.assertEquals(10, actual);
	}
	
	@Test
	public void returns_20_if_all_are_the_same() {
		/* Arrange */
		int int1 = 1;
		int int2 = 1;
		int int3 = 1;
		/* Act */
		int actual = target.greenTicket(int1, int2, int3);
		/* Assert */
		Assert.assertEquals(20, actual);
	}
	
	@Test
	public void returns_20_if_all_are_the_same_negative() {
		/* Arrange */
		int int1 = -1;
		int int2 = -1;
		int int3 = -1;
		/* Act */
		int actual = target.greenTicket(int1, int2, int3);
		/* Assert */
		Assert.assertEquals(20, actual);
	}
	
	@Test
	public void returns_20_if_all_are_the_same_zero() {
		/* Arrange */
		int int1 = 0;
		int int2 = 0;
		int int3 = 0;
		/* Act */
		int actual = target.greenTicket(int1, int2, int3);
		/* Assert */
		Assert.assertEquals(20, actual);
	}
	
	@Test
	public void returns_0_if_all_are_the_different_positive_negative_and_zero() {
		/* Arrange */
		int int1 = -1;
		int int2 = 0;
		int int3 = 1;
		/* Act */
		int actual = target.greenTicket(int1, int2, int3);
		/* Assert */
		Assert.assertEquals(0, actual);
	}
	
}