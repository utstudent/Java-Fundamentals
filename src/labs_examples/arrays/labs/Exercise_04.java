package labs_examples.arrays.labs;
import java.util.ArrayList;
/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        String [][] names = {
                {"Talha", "Erva"},
                {"Fatma", "Harun", "Hatice"},
                {"Seyfullah", "Hatice", "Zahit", "Kubra "}
        };

        for(String [] nameList : names) {
            for (String name : nameList)
            System.out.println(name);
            System.out.println();
        }

    }


}
