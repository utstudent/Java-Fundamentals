package labs_examples.arrays.examples;

public class ReplParametersReturnTypes {
    public static void main(String[] args) {

        int multiplied = multiply(3,5);
        System.out.println("Multiplication result: " +multiplied);

        int divided = divide(3,2);
        System.out.println("Division result: " + divided);

        boolean answer = isOdd(8);
        System.out.println("Is it odd?: " + answer);




    }

    public static int multiply(int a , int b) {
        return a*b;
    }

    // please write a static divide() method below that takes
    // two parameters (argumets) and returns the result of
    // dividing the first parameter by the second parameters

    public static int divide(int a , int b) {
        return a/b;
    }

    // please write a static isOdd() method that takes one numeric
    // parameter and returns a true (boolean) if the parameter is odd

    public static boolean isOdd(int a) {
        if (a%2==1) {
            return true;
        } else {
            return false;
        }
    }

    // please write a method that will take in a String (as an argument)
    // and return that String in reverse order. For instance, if you pass
    // in the String "programming is cool" the method will return the
    // String "looc si gnimmargorp"

    public static String reverseString (String a) {

        for(int i = 0; )
        a.

        return "hi";

    }
}
