package com.madhu.lambdas;

public class RecordExample {
    record Point(int x, int y){

    }
    interface Logger{
        void log();
    }

    record Message(String body) implements Logger{
        @Override
        public void log() {
            System.out.println(body);
        }
    }

    public static void main(String[] args) {
        var point = new Point(10,20);
        //get values
        System.out.println(point.x);
        //equals
        var secondPoint = new Point(10,20);
        System.out.println(point.equals(secondPoint));

        //record class with implementing inheritance
        var message = new Message("hello world");
        message.log();

    }

}
