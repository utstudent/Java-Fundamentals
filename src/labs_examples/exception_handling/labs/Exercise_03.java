package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class Exercise_03 {
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
        } finally {
            System.out.println("This will always print");
        }

        System.out.println("The program is complete!");
    }

}
