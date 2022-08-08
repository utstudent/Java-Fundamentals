package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int [][] nums = new int [5][5];

        for(int x = 0; x < nums.length; x++) {
            for (int y = 0; y < nums[x].length; y++) {
                nums[x][y] = (x+1)*(y+1)*3;
            }
        }

        for (int[] outer : nums) {
            for (int val : outer) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
