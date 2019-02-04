package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	private KataFizzBuzz target;
	
	@Before
	public void setup() {
		target = new KataFizzBuzz();
	}
	
	@Test
	public void convert_to_empty_string_if_zero_or_below() {
		String type1 = target.fizzBuzz(0);
		String type2 = target.fizzBuzz(-5);
		Assert.assertEquals("", type1);
		Assert.assertEquals("", type2);
	}
	
	@Test
	public void convert_to_empty_string_if_above_100() {
		String type1 = target.fizzBuzz(101);
		Assert.assertEquals("", type1);
	}
	
	@Test
	public void convert_to_fizzbuzz_if_divisible_by_3_and_5() {
		String type1 = target.fizzBuzz(15);
		String type2 = target.fizzBuzz(30);
		String type3 = target.fizzBuzz(45);
		String type4 = target.fizzBuzz(60);
		String type5 = target.fizzBuzz(75);
		String type6 = target.fizzBuzz(90);
		Assert.assertEquals("FizzBuzz", type1);
		Assert.assertEquals("FizzBuzz", type2);
		Assert.assertEquals("FizzBuzz", type3);
		Assert.assertEquals("FizzBuzz", type4);
		Assert.assertEquals("FizzBuzz", type5);
		Assert.assertEquals("FizzBuzz", type6);
	}
	
	@Test
	public void convert_to_fizzbuzz_if_contains_3_and_5() {
		String type1 = target.fizzBuzz(35);
		String type2 = target.fizzBuzz(53);
		Assert.assertEquals("FizzBuzz", type1);
		Assert.assertEquals("FizzBuzz", type2);
	}
	
	@Test
	public void convert_to_buzz_if_divisible_by_5() {
		String type1 = target.fizzBuzz(5);
		String type2 = target.fizzBuzz(25);
		String type3 = target.fizzBuzz(50);
		String type4 = target.fizzBuzz(65);
		String type5 = target.fizzBuzz(80);
		String type6 = target.fizzBuzz(100);
		Assert.assertEquals("Buzz", type1);
		Assert.assertEquals("Buzz", type2);
		Assert.assertEquals("Buzz", type3);
		Assert.assertEquals("Buzz", type4);
		Assert.assertEquals("Buzz", type5);
		Assert.assertEquals("Buzz", type6);
	}
	
	@Test
	public void convert_to_buzz_if_contains_5() {
		String type1 = target.fizzBuzz(52);
		String type2 = target.fizzBuzz(54);
		String type3 = target.fizzBuzz(56);
		String type4 = target.fizzBuzz(58);
		Assert.assertEquals("Buzz", type1);
		Assert.assertEquals("Buzz", type2);
		Assert.assertEquals("Buzz", type3);
		Assert.assertEquals("Buzz", type4);
	}
	
	@Test
	public void convert_to_fizz_if_divisible_by_3() {
		String type1 = target.fizzBuzz(3);
		String type2 = target.fizzBuzz(12);
		String type3 = target.fizzBuzz(24);
		String type4 = target.fizzBuzz(33);
		String type5 = target.fizzBuzz(48);
		String type6 = target.fizzBuzz(66);
		String type7 = target.fizzBuzz(81);
		String type8 = target.fizzBuzz(99);
		Assert.assertEquals("Fizz", type1);
		Assert.assertEquals("Fizz", type2);
		Assert.assertEquals("Fizz", type3);
		Assert.assertEquals("Fizz", type4);
		Assert.assertEquals("Fizz", type5);
		Assert.assertEquals("Fizz", type6);
		Assert.assertEquals("Fizz", type7);
		Assert.assertEquals("Fizz", type8);
	}
	
	@Test
	public void convert_to_fizz_if_contains_3() {
		String type1 = target.fizzBuzz(13);
		String type2 = target.fizzBuzz(23);
		String type3 = target.fizzBuzz(32);
		String type4 = target.fizzBuzz(34);
		String type5 = target.fizzBuzz(37);
		String type6 = target.fizzBuzz(38);
		String type7 = target.fizzBuzz(43);
		String type8 = target.fizzBuzz(73);
		String type9 = target.fizzBuzz(83);
		Assert.assertEquals("Fizz", type1);
		Assert.assertEquals("Fizz", type2);
		Assert.assertEquals("Fizz", type3);
		Assert.assertEquals("Fizz", type4);
		Assert.assertEquals("Fizz", type5);
		Assert.assertEquals("Fizz", type6);
		Assert.assertEquals("Fizz", type7);
		Assert.assertEquals("Fizz", type8);
		Assert.assertEquals("Fizz", type9);
	}
	
	@Test
	public void convert_integer_to_string_otherwise() {
		String type1 = target.fizzBuzz(2);
		String type2 = target.fizzBuzz(14);
		String type3 = target.fizzBuzz(26);
		String type4 = target.fizzBuzz(47);
		String type5 = target.fizzBuzz(68);
		String type6 = target.fizzBuzz(79);
		String type7 = target.fizzBuzz(82);
		String type8 = target.fizzBuzz(91);
		Assert.assertEquals("2", type1);
		Assert.assertEquals("14", type2);
		Assert.assertEquals("26", type3);
		Assert.assertEquals("47", type4);
		Assert.assertEquals("68", type5);
		Assert.assertEquals("79", type6);
		Assert.assertEquals("82", type7);
		Assert.assertEquals("91", type8);
	}
	
}