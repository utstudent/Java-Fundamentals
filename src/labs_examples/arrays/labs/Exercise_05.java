package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList();
        for(int i =0; i<50;i++){
            nums.add(i+1);
        }

        for (int x =nums.size()-1; x>0; x=x-2) {
            System.out.print(nums.get(x) + " ");
        }


    }

}
