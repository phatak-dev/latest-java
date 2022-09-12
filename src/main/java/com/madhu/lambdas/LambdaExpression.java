package com.madhu.lambdas;

public class LambdaExpression {

    interface Function<T,U> {
        U apply(T input);
    }

    static Integer increment(Integer value, Function<Integer,Integer> incrementFunction) {
        return incrementFunction.apply(value);
    }

    public static void main(String[] args) {
        var value = 10;
        var result = increment(value, new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer input) {
                return input+1;
            }
        });
        //same now can be achieved using
        var result2 = increment(value, (x) -> x+1);


    }
}
