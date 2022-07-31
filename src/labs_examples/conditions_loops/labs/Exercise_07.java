package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        String vowels = "aeiou";

        System.out.println("Enter A word: ");
        String word = scaner.nextLine();

        int i = 0;
        char firstVowel = 'a';

        while (i < word.length()) {

            int x = 0;
            while (x < vowels.length()) {
                if (word.charAt(i) == vowels.charAt(x)) {
                    firstVowel = vowels.charAt(x);
                    break;
                }

//            } else if (word.contains("e")) {
//                firstVowel = 'e';
//                break;
//            } else if (word.contains("i")) {
//                firstVowel = 'i';
//                break;
//            } else if (word.contains("o")) {
//                firstVowel = 'o';
//                break;
//            } else if (word.contains("u")) {
//                firstVowel = 'u';
//                break;
//            }
                x++;
            }
            i++;
        }
        System.out.println("Your word is: " + word + ". First vowel is: " + firstVowel);
    }
}
