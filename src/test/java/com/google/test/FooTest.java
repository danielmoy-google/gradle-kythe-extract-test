package com.google.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public final class FooTest {

  @Test
  public void methodUnderTest_expectedResult() {
    assertEquals("asdf", Foo.funcCall());
  }
}
