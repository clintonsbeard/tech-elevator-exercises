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
	public void negative_integers_return_false() {
		/* Arrange */
		/* Act */
		boolean negativeIntegersTest = target.getLucky(new array = {-2, -4, -6});
		/* Assert */
		Assert.assertFalse(negativeIntegersTest);
	}

	@Test
	public void zero_returns_an_empty_string() {
		/* Arrange */
		/* Act */
		String zeroIntegerTest = target.generateString("abc", 0);
		/* Assert */
		Assert.assertEquals("", zeroIntegerTest);
	}

	@Test
	public void null_returns_empty_string() {
		/* Arrange */
		/* Act */
		String nullInputTest = target.generateString(null, 6);
		/* Assert */
		Assert.assertEquals("", nullInputTest);
	}

}