package com.madhu.lambdas;

import java.util.function.Function;

public class InterfaceBasedProgramming {

    interface InterestCalculator {
        double interest(double amount);
    }

    static double calculateInterest(double amount, InterestCalculator interestCalculator) {
        return  interestCalculator.interest(amount);
    }

    public static void main(String[] args) {
      var amount = 100;
      InterestCalculator interestCalculator = new InterestCalculator() {
          @Override
          public double interest(double amount) {
              return amount+amount*0.1;
          }
      };


      System.out.println(calculateInterest(amount,interestCalculator));
      System.out.println(calculateInterest(amount,(a) -> a+a*0.1));

    }
}
