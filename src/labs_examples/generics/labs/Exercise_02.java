package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo{

}

class GenericClass2<N>{

    private N number;

    public GenericClass2(N number) {
        this.number = number;
    }

    public static <V extends Number> void sum(ArrayList<V> list){
        ArrayList<V> firstList = list;
        V total;
        V = list.get(0)- list.get(0);


        for (int i = 0; i< list.size(); i++) {
            total = total + list.get(i);
        }

        //return finalList;
    }
}