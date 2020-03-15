package com.kursjava.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ITCheckFactorial {
  @Test
  public void shouldReturnFactorial() {
    assertEquals(24, FactorialCounter.factorial(4));
  }
}