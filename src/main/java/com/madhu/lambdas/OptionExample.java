package com.madhu.lambdas;

import java.util.Optional;

public class OptionExample {

    public static void main(String[] args) {
        var optionalInteger = Optional.of(10);

        System.out.println(optionalInteger.isEmpty());
        System.out.println(optionalInteger.get());

        //map on optional
        var addValue = optionalInteger.map(v -> v+1);
        System.out.println(addValue.get());
    }
}
