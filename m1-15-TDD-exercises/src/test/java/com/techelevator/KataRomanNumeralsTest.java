package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {

	private KataRomanNumerals target;
	
	@Before
	public void setup() {
		target = new KataRomanNumerals();
	}
	
	@Test
	public void convert_single_characters() {
		Assert.assertEquals("Failed to convert I", 1, target.convertToDigit("I"));
		Assert.assertEquals("Failed to convert V", 5, target.convertToDigit("V"));
		Assert.assertEquals("Failed to convert X", 10, target.convertToDigit("X"));
		Assert.assertEquals("Failed to convert L", 50, target.convertToDigit("L"));
		Assert.assertEquals("Failed to convert C", 100, target.convertToDigit("C"));
		Assert.assertEquals("Failed to convert D", 500, target.convertToDigit("D"));
		Assert.assertEquals("Failed to convert M", 1000, target.convertToDigit("M"));
	}
	
	@Test
	public void convert_doubles_of_single_characters() {
		Assert.assertEquals("Failed to convert II", 2, target.convertToDigit("II"));
		Assert.assertEquals("Failed to convert XX", 20, target.convertToDigit("XX"));
		Assert.assertEquals("Failed to convert CC", 200, target.convertToDigit("CC"));
		Assert.assertEquals("Failed to convert MM", 2000, target.convertToDigit("MM"));
	}
	
	@Test
	public void convert_triples_of_single_characters() {
		Assert.assertEquals("Failed to convert III", 3, target.convertToDigit("III"));
		Assert.assertEquals("Failed to convert XXX", 30, target.convertToDigit("XXX"));
		Assert.assertEquals("Failed to convert CCC", 300, target.convertToDigit("CCC"));
		Assert.assertEquals("Failed to convert MMM", 3000, target.convertToDigit("MMM"));
	}
	
	@Test
	public void convert_subtracting_characters() {
		Assert.assertEquals("Failed to convert IV", 4, target.convertToDigit("IV"));
		Assert.assertEquals("Failed to convert IX", 9, target.convertToDigit("IX"));
		Assert.assertEquals("Failed to convert XL", 40, target.convertToDigit("XL"));
		Assert.assertEquals("Failed to convert CM", 900, target.convertToDigit("CM"));
	}
	
	@Test
	public void convert_adding_characters() {
		Assert.assertEquals("Failed to convert VI", 6, target.convertToDigit("VI"));
		Assert.assertEquals("Failed to convert XVII", 17, target.convertToDigit("XVII"));
		Assert.assertEquals("Failed to convert MDCLXVI", 1666, target.convertToDigit("MDCLXVI"));
	}
	
	@Test
	public void convert_adding_and_subtracting_characters() {
		Assert.assertEquals("Failed to convert MCMXC", 1990, target.convertToDigit("MCMXC"));
		Assert.assertEquals("Failed to convert MMCMXCIX", 2999, target.convertToDigit("MMCMXCIX"));
	}
	
	@Test
	public void convert_single_digits() {
		Assert.assertEquals("Failed to convert 1", "I", target.convertToDigit("1"));
	}
	
}