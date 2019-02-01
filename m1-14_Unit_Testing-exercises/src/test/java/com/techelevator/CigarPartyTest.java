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
		boolean haveParty = target.haveParty(-900, false);
		/* Assert */
		Assert.assertFalse(haveParty);
	}
	
	@Test
	public void cigars_way_over_returns_true() {
		/* Arrange */
		/* Act */
		boolean haveParty = target.haveParty(6000000, true);
		/* Assert */
		Assert.assertTrue(haveParty);
	}
	
}