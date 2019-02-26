package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day15Test {

	private Day15 target;
	
	@Before
	public void setup() {
		target = new Day15();
	}

	@Test
	public void returns_true_if_2s_or_3s() {
		/* Arrange */
		int[] arrayInput = {2, 3};
		/* Act */
		boolean actual = target.has23(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
}