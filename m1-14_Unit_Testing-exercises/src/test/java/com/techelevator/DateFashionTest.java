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
	public void negative_fashion_scores_return_zero() {
		/* Arrange */
		/* Act */
		int type = target.getATable(-5, -7);
		/* Assert */
		Assert.assertEquals(0, type);
	}
	
	@Test
	public void fashion_scores_over_ten_return_two() {
		/* Arrange */
		/* Act */
		int type = target.getATable(12, 15);
		/* Assert */
		Assert.assertEquals(2, type);
	}
	
}