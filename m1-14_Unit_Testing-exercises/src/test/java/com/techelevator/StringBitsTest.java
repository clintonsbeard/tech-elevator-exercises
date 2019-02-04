package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class StringBitsTest {

	private StringBits target;
	
	@Before
	public void setup() {
		target = new StringBits();
	}

	@Test
	public void spaces_return_correct_result() {
		/* Arrange */
		/* Act */
		String type = target.getBits("H e l l o");
		/* Assert */
		Assert.assertEquals("Hello", type);
	}
	
	@Test
	public void underscores_return_correct_result() {
		/* Arrange */
		/* Act */
		String type = target.getBits("H_e_l_l_o");
		/* Assert */
		Assert.assertEquals("Hello", type);
	}
	
	@Test
	public void integers_return_correct_result() {
		/* Arrange */
		/* Act */
		String type = target.getBits("H1e2l3l4o");
		/* Assert */
		Assert.assertEquals("Hello", type);
	}
	
	@Test
	public void mixed_case_returns_correct_result() {
		/* Arrange */
		/* Act */
		String type = target.getBits("HhEeLlLlOo");
		/* Assert */
		Assert.assertEquals("HELLO", type);
	}
	
}