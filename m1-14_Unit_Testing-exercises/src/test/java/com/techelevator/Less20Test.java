package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class Less20Test {

	private Less20 target;
	
	@Before
	public void setup() {
		target = new Less20();
	}

	@Test
	public void negative_integers_return_false() {
		/* Arrange */
		/* Act */
		boolean type = target.isLessThanMultipleOf20(-22);
		/* Assert */
		Assert.assertFalse(type);
	}
	
	@Test
	public void zero_returns_false() {
		/* Arrange */
		/* Act */
		boolean type = target.isLessThanMultipleOf20(0);
		/* Assert */
		Assert.assertFalse(type);
	}
	
}