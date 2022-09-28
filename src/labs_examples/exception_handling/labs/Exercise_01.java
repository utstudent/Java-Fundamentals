package labs_examples.exception_handling.labs;


import java.util.Scanner;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers to divide: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            System.out.println("The answer is: ");
            System.out.println(a/b);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("The program is complete!");
    }

}

