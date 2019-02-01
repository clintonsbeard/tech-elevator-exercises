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
	public void negative_numbers_return_false() {
		/* Arrange */
		/* Act */
		boolean isLessThanMultipleOf20Test = target.isLessThanMultipleOf20(-22);
		/* Assert */
		Assert.assertFalse(isLessThanMultipleOf20Test);
	}
	
}