package com.madhu.lambdas;

import java.util.function.Function;
import java.util.function.Supplier;

public class HighOrderFunctions {

    static String inputFormatter(String data, Function<String,String> fmt) {

        return fmt.apply(data);
    }

    static Supplier<String> delayedSupplier(String data) {
        return () -> {
            //do some costly work which needs to be run only when needed
            return "length of the string is "+data.length();
        };
    }
    public static void main(String[] args) {

     var formattedString = inputFormatter("hello world", (value) -> "the formatted value is :"+value);
     System.out.println(formattedString);

     var delayedSupplier = delayedSupplier("hello world");
     System.out.println(delayedSupplier.get());
    }
}
