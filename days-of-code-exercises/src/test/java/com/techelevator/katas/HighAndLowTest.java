package com.techelevator.katas;

import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

public class HighAndLowTest {
	
  @Test
  public void Test1() {
    assertEquals("42 -9", HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
  }
  
}