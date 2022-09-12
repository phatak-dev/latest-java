package com.madhu.lambdas;

import java.util.logging.Logger;

public class InterfaceDefaultMethod {

    interface Logger {
        void log(String data);
        default void formattedLogger(String data) {
            log(data);
        }
    }

    class FileLogger implements Logger {
        @Override
        public void log(String data) {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {

    }
}
