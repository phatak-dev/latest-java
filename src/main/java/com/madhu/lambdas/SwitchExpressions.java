package com.madhu.lambdas;

public class SwitchExpressions {

    public static void main(String[] args) {
      var errorCode = 200;
      var errorStatus = "";

      switch (errorCode) {
          case 200 : errorStatus = "OK"; break;
          case 400:  errorStatus = "NOT FOUND"; break;
          default : errorStatus ="UNKNOWN";
      }
      System.out.println("the error status is " + errorStatus);

      //switch as expression
      errorStatus = switch (errorCode) {
          case 200 -> "OK";
          case 400 -> "NOT FOUND";
          default -> "UNKNOWN";
      };
      System.out.println("the error status is "+ errorStatus);

    }
}
