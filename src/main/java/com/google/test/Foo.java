package com.google.test;

/** Test app for gradle extraction */
final class Foo {

  public static void main(String[] args) {
    System.out.println("Gradle extraction");
    System.out.println(funcCall());
  }

  static String funcCall() {
    return "asdf";
  }
}
