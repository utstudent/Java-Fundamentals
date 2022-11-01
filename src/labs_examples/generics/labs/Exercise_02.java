package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;
class GenericClass2<N>{
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(8);
        testList.add(11);
        testList.add(4);

        double total = sum(testList);
        System.out.println(total);
    }
    private N number;
    public GenericClass2(N number) {
        this.number = number;
    }
    public static double sum(ArrayList<? extends Number> list){
        double sum = 0;


        for (int i = 0; i< list.size(); i++) {
            sum = sum + list.get(i).doubleValue();
        }

        return sum;
    }
}