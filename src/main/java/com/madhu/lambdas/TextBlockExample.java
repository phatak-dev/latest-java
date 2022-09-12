package com.madhu.lambdas;

public class TextBlockExample {
    public static void main(String[] args) {
        var value = 100.0;
        var textBlock = """
                Hello this is a block with special characters like $$
                Does this infer $value let's see
                infering value will be 
                """;
        System.out.println(textBlock);
    }
}
