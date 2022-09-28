package labs_examples.exception_handling.labs;


import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class Exercise_07 {

    public static void main(String[] args) {

        int gasTankMiles = 150;

        try {
            drive(gasTankMiles);
        } catch (GasTankEmptyException e) {
            System.out.println(e.toString());
        }


    }

    public static void drive(int gasTankMiles) throws GasTankEmptyException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many miles remaining?");
        int roadMilesRemaining = scanner.nextInt();
        if (roadMilesRemaining<gasTankMiles) {
            System.out.println("There is enough gas, driving now!");
        } else {
            throw new GasTankEmptyException();
        }
    }

}
