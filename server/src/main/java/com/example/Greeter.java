/**
Package name
*/
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
  * @param name of a person to greet	
  * @return greeting String
  */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
