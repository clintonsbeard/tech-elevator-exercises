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