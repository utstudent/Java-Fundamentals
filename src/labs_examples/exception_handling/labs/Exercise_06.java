package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Exercise_06 {

    public static void main(String[] args) {

        try {
            someMethod();
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.toString());
        }

        System.out.println("Program is finished!");
    }

    public static void someMethod() throws ArithmeticException{
        divide();
    }

    public static int divide() throws ArithmeticException {
        return 5/0;
    }

}