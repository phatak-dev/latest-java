package com.madhu.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        var integerList = new ArrayList<Integer>();
        integerList.add(10);
        integerList.add(5);
        integerList.add(4);
        //normal iteration
        for(var i = 0; i<integerList.size();i++) {
            integerList.set(i,integerList.get(i)+1);
        }

        var integerStream = integerList.stream();

        var sum = integerStream.filter(value -> value%2 == 0)
                .map(value -> value +1)
                .reduce((a,b) -> a+b);
        System.out.println(sum.get());

        var mappedStream = integerList.stream().map(value -> value+1);
        System.out.println(mappedStream.toList());

        //reuse failure of the streams
        var integerStream2 = integerList.stream();
        var sumResult = integerStream2.reduce((a,b) -> a+b).get();
        //the below code fails with "stream has already been operated upon or closed"
        //var anotherSum = integerStream2.reduce((a,b)-> a+b).get();


    }
}
