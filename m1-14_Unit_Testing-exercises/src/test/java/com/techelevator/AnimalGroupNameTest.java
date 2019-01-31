package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class AnimalGroupNameTest {
	
	private AnimalGroupName target;
	
	@Before
	public void setup() {
		target = new AnimalGroupName();
	}

	@Test
	public void correct_name_returned_when_key_is_mixed_case() {
		/* Arrange */
		/* Act */
		String herd = target.getHerd("PiGeOn");
		/* Assert */
		Assert.assertEquals("Kit", herd);
	}
	
	@Test
	public void key_not_known_returns_unknown() {
		/* Arrange */
		/* Act */
		String herd = target.getHerd("walrus");
		/* Assert */
		Assert.assertEquals("unknown", herd);
	}
	
	@Test
	public void null_returns_unknown() {
		/* Arrange */
		/* Act */
		String herd = target.getHerd(null);
		/* Assert */
		Assert.assertEquals("unknown", herd);
	}
	
}