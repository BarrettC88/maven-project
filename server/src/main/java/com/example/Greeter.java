package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  * This method prints out a greeting using a	
  * String passed in the argument
  */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
