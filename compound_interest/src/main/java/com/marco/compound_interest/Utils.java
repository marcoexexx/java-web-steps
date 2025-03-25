package com.marco.compound_interest;

public class Utils {
  public static double calculateCompoundInterest(double principal, double interest, int years, int compoundingPeriod) {
    return principal * Math.pow((1 + (interest / compoundingPeriod)), (compoundingPeriod * years));
  }

  public static String hello() {
    return "Hello, World";
  }
}
