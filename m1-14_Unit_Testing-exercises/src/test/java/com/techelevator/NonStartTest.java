package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class NonStartTest {

	private NonStart target;
	
	@Before
	public void setup() {
		target = new NonStart();
	}

	@Test
	public void string_a_is_empty_returns_string_b() {
		/* Arrange */
		/* Act */
		String type = target.getPartialString("", "String");
		/* Assert */
		Assert.assertEquals("tring", type);
	}
	
	@Test
	public void string_b_is_empty_returns_string_a() {
		/* Arrange */
		/* Act */
		String type = target.getPartialString("String", "");
		/* Assert */
		Assert.assertEquals("tring", type);
	}
	
	@Test
	public void string_a_and_b_return_correct_result() {
		/* Arrange */
		/* Act */
		String type = target.getPartialString("String", "String");
		/* Assert */
		Assert.assertEquals("tringtring", type);
	}
	
	@Test
	public void spaces_return_correct_result() {
		/* Arrange */
		/* Act */
		String type = target.getPartialString(" tring", " tring");
		/* Assert */
		Assert.assertEquals("tringtring", type);
	}
	
	@Test
	public void underscores_return_correct_result() {
		/* Arrange */
		/* Act */
		String type = target.getPartialString("_tring", "_tring");
		/* Assert */
		Assert.assertEquals("tringtring", type);
	}
	
	@Test
	public void null_strings_return_null() {
		/* Arrange */
		/* Act */
		String type = target.getPartialString(null, null);
		/* Assert */
		Assert.assertEquals(null, type);
	}

}