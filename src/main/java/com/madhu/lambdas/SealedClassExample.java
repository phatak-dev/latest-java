package com.madhu.lambdas;

public class SealedClassExample {
    public sealed interface BOOLEAN{};

    record TRUE() implements  BOOLEAN{
        @Override
        public String toString() {
            return "TRUE";
        }
    };
    record FALSE() implements BOOLEAN{
        @Override
        public String toString() {
            return "FALSE";
        }
    }

    public static void main(String[] args) {

        BOOLEAN value = new TRUE();
        System.out.println(value);

        //patten matching . Requires --enable-preview
        /*(switch (value) {
            case TRUE t -> System.out.println("it is a true value");
            case FALSE f -> System.out.println("it is a false value");
        }*/

    }

}
