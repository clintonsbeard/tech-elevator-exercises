package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day14Test {

	private Day14 target;
	
	@Before
	public void setup() {
		target = new Day14();
	}

	@Test
	public void method_returns_expected() {
		/* Arrange */
		int a = 1;
		int b = 7;
		int c = 11;
		/* Act */
		boolean actual = target.lessBy10(a, b, c);
		/* Assert */
		Assert.assertTrue(actual);
		/* Arrange */
		a = 1;
		b = 7;
		c = 10;
		/* Act */
		actual = target.lessBy10(a, b, c);
		/* Assert */
		Assert.assertFalse(actual);
		/* Arrange */
		a = 11;
		b = 1;
		c = 7;
		/* Act */
		actual = target.lessBy10(a, b, c);
		/* Assert */
		Assert.assertTrue(actual);
	}

}