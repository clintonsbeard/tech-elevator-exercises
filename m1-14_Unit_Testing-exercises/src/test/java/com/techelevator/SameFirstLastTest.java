package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class SameFirstLastTest {

	private SameFirstLast target;
	
	@Before
	public void setup() {
		target = new SameFirstLast();
	}

	@Test
	public void correct_name_returned_when_key_is_mixed_case() {
		/* Arrange */
		/* Act */
		String herd = target.getHerd("PiGeOn");
		/* Assert */
		Assert.assertEquals("Kit", herd);
	}
	
}