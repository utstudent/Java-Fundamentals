package labs_examples.generics.labs;

import java.util.ArrayList;
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

    //private N number;


    public static <N extends Number, V extends Number> double sum(N number, V val){

        double sum = 0;

        sum = number.doubleValue()+ val.doubleValue();

        return sum;
    }

    public static void main(String[] args) {

        double testSumFunction = sum(45.34,120);
        System.out.println(testSumFunction);
    }

}
