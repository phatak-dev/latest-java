package com.madhu.lambdas;

import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {
        Consumer<String> println = System.out::println;
        println.accept("hello");
    }
}
