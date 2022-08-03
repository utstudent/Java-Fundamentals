package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 numbers: ");

        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        numbers[3] = scanner.nextInt();
        numbers[4] = scanner.nextInt();
        numbers[5] = scanner.nextInt();
        numbers[6] = scanner.nextInt();
        numbers[7] = scanner.nextInt();
        numbers[8] = scanner.nextInt();
        numbers[9] = scanner.nextInt();

        for(int i : numbers) {
            sum += i;
        }

        double avg = 1.0 * sum/10;

        System.out.println();
        System.out.println("Sum is " + sum + ". Average is " + avg);

    }

}