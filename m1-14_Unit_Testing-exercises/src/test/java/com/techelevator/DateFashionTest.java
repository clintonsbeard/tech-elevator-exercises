package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class DateFashionTest {

	private DateFashion target;
	
	@Before
	public void setup() {
		target = new DateFashion();
	}

	@Test
	public void negative_fashionscores_return_zero() {
		/* Arrange */
		/* Act */
		int getTable = target.getATable(-50000, -167000);
		/* Assert */
		Assert.assertEquals(0, getTable);
	}
	
}