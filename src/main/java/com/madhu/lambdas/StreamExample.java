package com.madhu.lambdas;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        var integerList = List.of(1,3,4,5,5,6);
        var integerStream = integerList.stream();

        var sum = integerStream.filter(value -> value%2 == 0)
                .map(value -> value +1)
                .reduce((a,b) -> a+b);
        System.out.println(sum.get());

        var mappedStream = integerList.stream().map(value -> value+1);
        System.out.println(mappedStream.toList());
    }
}
