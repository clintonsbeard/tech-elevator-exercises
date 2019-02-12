package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CigarPartyTest {

	private CigarParty target;
	
	@Before
	public void setup() {
		target = new CigarParty();
	}

	@Test
	public void too_few_cigars_on_weekday_returns_false() {
		/* Arrange */
		/* Act */
		boolean type = target.haveParty(39, false);
		/* Assert */
		Assert.assertFalse(type);
	}
	
	@Test
	public void too_few_cigars_on_weekend_returns_false() {
		/* Arrange */
		/* Act */
		boolean type = target.haveParty(20, true);
		/* Assert */
		Assert.assertFalse(type);
	}
	
	@Test
	public void correct_cigars_on_weekday_returns_true() {
		/* Arrange */
		/* Act */
		boolean type = target.haveParty(40, false);
		/* Assert */
		Assert.assertTrue(type);
	}
	
	@Test
	public void too_many_cigars_on_weekday_returns_false() {
		/* Arrange */
		/* Act */
		boolean type = target.haveParty(61, false);
		/* Assert */
		Assert.assertFalse(type);
	}
	
	@Test
	public void correct_cigars_on_weekend_returns_true() {
		/* Arrange */
		/* Act */
		boolean type = target.haveParty(65, true);
		/* Assert */
		Assert.assertTrue(type);
	}
	
	@Test
	public void negative_cigars_return_false() {
		/* Arrange */
		/* Act */
		boolean type = target.haveParty(-900, false);
		/* Assert */
		Assert.assertFalse(type);
	}
	
	@Test
	public void zero_cigars_return_false() {
		/* Arrange */
		/* Act */
		boolean type = target.haveParty(0, false);
		/* Assert */
		Assert.assertFalse(type);
	}
	
	@Test
	public void cigars_way_over_returns_true() {
		/* Arrange */
		/* Act */
		boolean type = target.haveParty(6000000, true);
		/* Assert */
		Assert.assertTrue(type);
	}
	
}