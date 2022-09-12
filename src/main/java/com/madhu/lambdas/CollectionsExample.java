package com.madhu.lambdas;

import java.util.ArrayList;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        var integerList = new ArrayList<Integer>();
        integerList.add(10);
        integerList.add(5);
        integerList.add(4);
        //sort using the lambda
        integerList.sort((a,b) -> a>b?a:b);
        System.out.println(integerList);
    }
}
