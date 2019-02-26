package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day7Test {

	private Day7 target;
	
	@Before
	public void setup() {
		target = new Day7();
	}

	@Test
	public void returns_true_if_no_triples() {
		/* Arrange */
		int[] arrayInput = {1, 1, 2, 2, 1};
		/* Act */
		boolean actual = target.noTriples(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
	@Test
	public void returns_false_if_triples() {
		/* Arrange */
		int[] arrayInput = {1, 1, 2, 2, 2, 1};
		/* Act */
		boolean actual = target.noTriples(arrayInput);
		/* Assert */
		Assert.assertFalse(actual);
		/* Arrange */
		int[] arrayInput2 = {1, 1, 1, 2, 2, 2, 1};
		/* Act */
		boolean actual2 = target.noTriples(arrayInput2);
		/* Assert */
		Assert.assertFalse(actual2);
	}
	
	@Test
	public void returns_false_if_triple_zeros() {
		/* Arrange */
		int[] arrayInput = {0, 0, 0, 2, 2, 1};
		/* Act */
		boolean actual = target.noTriples(arrayInput);
		/* Assert */
		Assert.assertFalse(actual);
	}
	
	@Test
	public void returns_true_if_not_triple_zeros() {
		/* Arrange */
		int[] arrayInput = {0, 0, 1, 2, 2, 1};
		/* Act */
		boolean actual = target.noTriples(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
	@Test
	public void returns_false_if_triple_negatives() {
		/* Arrange */
		int[] arrayInput = {-10, -10, -10, 2, 2, 1};
		/* Act */
		boolean actual = target.noTriples(arrayInput);
		/* Assert */
		Assert.assertFalse(actual);
	}
	
	@Test
	public void returns_true_if_negatives_and_positives_mixed() {
		/* Arrange */
		int[] arrayInput = {-5, 5, -5, 2, 2, 1};
		/* Act */
		boolean actual = target.noTriples(arrayInput);
		/* Assert */
		Assert.assertTrue(actual);
	}
	
}