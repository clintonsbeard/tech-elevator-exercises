package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FrontTimesTest {

private FrontTimes target;
	
	@Before
	public void setup() {
		target = new FrontTimes();
	}

	@Test
	public void negative_integers_return_original_string() {
		/* Arrange */
		/* Act */
		String type = target.generateString("abc", -6);
		/* Assert */
		Assert.assertEquals("abc", type);
	}
	
	@Test
	public void zero_returns_an_empty_string() {
		/* Arrange */
		/* Act */
		String type = target.generateString("abc", 0);
		/* Assert */
		Assert.assertEquals("", type);
	}
	
	@Test
	public void null_returns_empty_string() {
		/* Arrange */
		/* Act */
		String type = target.generateString(null, 6);
		/* Assert */
		Assert.assertEquals("", type);
	}
	
}