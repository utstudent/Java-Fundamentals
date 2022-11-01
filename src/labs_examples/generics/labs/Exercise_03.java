package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
 *
 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */


class GenericClass3<N> {

    public static void main(String[] args) {

        //exercise 1 test
        double testSumFunction = sum(45.34,120);
        System.out.println(testSumFunction);
        System.out.println("-------------------------------------------------------------");

        // exercise 2
        String testWord = "abba";
        String testWord2 = "abbas";
        boolean exercise2 = isPalindromes(testWord);
        boolean exercise2_1 = isPalindromes(testWord2);
        System.out.println(exercise2);
        System.out.println(exercise2_1);
        System.out.println("-------------------------------------------------------------");

        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("abba");
        stringArray.add("abbas");
        stringArray.add("elle");
        stringArray.add("talat");
        stringArray.add("vee");
        int palindromeCount = numberOfPalindromes(stringArray);
        System.out.println(palindromeCount);
        System.out.println("-------------------------------------------------------------");


        //exercise 3 test
        Integer[] testList3 = {5,7,2,9,4};
        System.out.println("Before: " + Arrays.toString(testList3));
        exchangePositions(1,3,testList3);
        System.out.println("After: " + Arrays.toString(testList3));

        String[] testList3_1 = {"hello", "whats", "your", "name"};
        System.out.println("Before: " + Arrays.toString(testList3_1));
        exchangePositions(1,3,testList3_1);
        System.out.println("After: " + Arrays.toString(testList3_1));

        System.out.println("-------------------------------------------------------------");


        //exercise 4 test
        ArrayList<Double> testList4 = new ArrayList<>();
        testList4.add(23.54);
        testList4.add(25.90);
        testList4.add(32.45);
        testList4.add(29.72);

        double largest = largestInList(testList4);
        System.out.println(largest);
        System.out.println("-------------------------------------------------------------");

        String largestString = largestInList(stringArray);
        System.out.println(largestString);
    }
    public static <N extends Number, V extends Number> double sum(N number, V val){ // exercise 1
        return number.doubleValue()+ val.doubleValue();
    }

    public static <T extends Collection> int numberOfPalindromes(T list) { // exercise 2
        int count = 0;

        for (int i = 0; i<list.size(); i++){
            if(isPalindromes(String.valueOf(list.toArray()[i]))) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindromes(String word) {
        int length = word.length();
        for (int i = 0; i < length/2; i++){
            if (word.charAt(i) != word.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }


    public static <T> void exchangePositions(int one, int two,  T[] list) { //exercise 3

        T holder = list[one];

        list[one] = list[two];

        list[two] = holder;
    }

    public static <T extends Comparable> T largestInList(ArrayList<T> list) { //exercise 4
        T largest = list.get(0);

        for (int i = 0; i< list.size(); i++){
            if (list.get(i).compareTo(largest)>0) {
                largest = list.get(i);
            }
        }

        return largest;
    }





}
