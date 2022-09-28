package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {

        try {
            int x = divide(5,0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.toString());
        }

        System.out.println("Program is finished!");
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

}