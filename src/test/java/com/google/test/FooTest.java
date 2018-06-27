package com.google.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public final class FooTest {

  @Test
  public void methodUnderTest_expectedResult() {
    assertEquals("asdf", Foo.funcCall());
    assertEquals("asdf", "asdf");
  }
}
