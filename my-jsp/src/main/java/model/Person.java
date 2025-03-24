package model;

import java.io.Serializable;

// JavaBean | Main 3 rules
//
// 1. Implements `Serializable`
// 2. No arg constructor
// 3. private member, public getter and setter.

public class Person implements Serializable {
  private String firstName;
  private String lastName;
  private int age;

  public Person() {
  }

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
