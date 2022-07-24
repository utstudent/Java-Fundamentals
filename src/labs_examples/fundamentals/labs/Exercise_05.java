package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int strLength = str.length();
        System.out.println("length of str is: " + strLength);

        String str2 = "hello";

        // please initialize a boolean variable and test whether str is equal to str2
        boolean equal = str.equals(str2);
        System.out.println("str is equal to str2: " + equal);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str+str2;
        System.out.println(str3);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        String test1 = str.replace("l", "t");
        System.out.println(test1);

        String test2 = str.substring(1, 5);
        System.out.println(test2);

        boolean containsTest = str2.contains("hell");
        System.out.println("Does str2 contian hell? true or false: " + containsTest);

        String mystr = "My name is Bob and I am builder";
        int indexOfTest = mystr.indexOf("Bob");
        System.out.println("Bobs index is: " + indexOfTest);

    }

}