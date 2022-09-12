package com.madhu;

import java.util.ArrayList;
import java.util.List;
public class TypeInferenceExample {
    public static void main(String[] args) {
        //old java
        List<String> list = new ArrayList<String>();
        //new java
        var newList = new ArrayList<String>();
        //Example of initialisation
        var floatValue = 10.0;
        var stringValue = "Hello World";
        var thread = new Thread();
    }
}
