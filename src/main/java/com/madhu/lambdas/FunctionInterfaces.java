package com.madhu.lambdas;

import scala.Int;

import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionInterfaces {

    static Integer callFunction(Callable<Integer> callable) throws Exception {
        return callable.call();
    }


    public static void main(String[] args) throws Exception {
        Function<Integer,Integer> simpleFunction = (Integer x) -> x+10;
        System.out.println(simpleFunction.apply(10));

        callFunction(()->10);

        Consumer<Integer> noReturnFunction = (Integer x) -> System.out.println(10);
        noReturnFunction.accept(10);

        Supplier<Integer> noInputFunction =  () -> 10;
        System.out.println(noInputFunction.get());


    }
}
