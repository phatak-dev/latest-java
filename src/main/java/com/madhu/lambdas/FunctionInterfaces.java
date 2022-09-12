package com.madhu.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionInterfaces {
    public static void main(String[] args) {
        Function<Integer,Integer> simpleFunction = (Integer x) -> x+10;
        System.out.println(simpleFunction.apply(10));

        Consumer<Integer> noReturnFunction = (Integer x) -> System.out.println(10);
        noReturnFunction.accept(10);

        Supplier<Integer> noInputFunction =  () -> 10;
        System.out.println(noInputFunction.get());


    }
}
