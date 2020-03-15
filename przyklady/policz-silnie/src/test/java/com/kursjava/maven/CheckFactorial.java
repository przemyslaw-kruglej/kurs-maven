package com.kursjava.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckFactorial {
  @Test
  public void shouldReturnFactorial() {
    assertEquals(120, FactorialCounter.factorial(5));
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowExceptionForInvalidArgument() {
    FactorialCounter.factorial(-1);
  }
}