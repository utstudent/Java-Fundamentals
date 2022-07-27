package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        double pi = 3.141592653589793;
        int height = 5;
        double radius = 3.14;

        double volume = pi * radius * radius * height;
        double surfaceArea = 2 * pi * radius * height + 2 * pi * radius * radius;

        System.out.println("Volume is: " + volume);
        System.out.println("Surface area is: " + surfaceArea);


    }
}