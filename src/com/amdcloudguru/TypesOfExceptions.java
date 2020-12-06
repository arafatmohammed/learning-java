package com.amdcloudguru;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TypesOfExceptions {
    public static void main(String[] args) {
        // Checked Exceptions - Exceptions that need to be handled at Compile time. Use try-catch block or throws keyword
        // Unchecked Exceptions - Not checked at Compile time, if you handle them, the program will not give you a compilation error

        // Checked Exceptions
        try {
            FileInputStream inputStream = new FileInputStream("src/example.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Unchecked Exceptions
//
//        var results = 10 / 0;
//
//        System.out.println(results);

        // Adding try-catch to fix the unchecked exception

        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide number by 0");
        } finally {
            System.out.println("Cleaning up...");
        }

        // Keywords need to learn for try-catch:

        // try : add logic here, if that logic errs, use catch

        // catch : In here you pass the exception type you are expecting, if you do not know what exception type, put "Exception"

        // finally: If the try-catch works or not, execute regardless, for cleanup purposes

        // catch () : Inside this paranthesis, it is not limited by one exception, you can have multiple catch () blocks, or have one catch () with multiple exceptions separated by "|"


        performDivision(1, 0);

    }

    static double performDivision(double a, double b) {
        if (b == 0) {
            throw new MyException("cannot divide by 0");
        }
        return a / b;
    }

    // RuntimeException: Unchecked Exception.
    // Checked Exception comes with try-catch
    static class MyException extends RuntimeException {
        public MyException(String message) {
            super(message);
        }
    }
}
