package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {
    public static void main(String[] args) {
        // 2) pass by value
        int a = 7;
        int b = 4;
        add(a,b);

        System.out.println("a is " + a + " and b is " + b);

        // 2) pass by reference
        Person talha = new Person(21, "Talha");
        System.out.println(talha.toString());

        talha.ageUp();
        System.out.println(talha.toString());

        int result = highest(4,9,31,66);
        System.out.println("The highest number is: " + result);

        int totalConsonants = consonantCounter("Apple");
        System.out.println("Total number of consonants is " + totalConsonants);


        int sample = 17;
        boolean isPrime = isPrime(sample);
        System.out.println("The number " + sample +" is prime. T/F? ---> " + isPrime);

    }
    public static void add(int a, int b) {
        a = a+b;
        System.out.println(a);
    }

    // 1) method overloading
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3)
    // is this efficient?
    public static int highest(int a, int b, int c, int d) {
        int highest = 0;

        ArrayList<Integer> list = new ArrayList<>();

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        for(int num : list){
            if (num>highest) {
                highest = num;
            }
        }

        return highest;
    }


    // 4)
    public static int consonantCounter(String string) {
        int counter = 0;

        string = string.toLowerCase();

        for (int i = 0; i<string.length(); i++) {

            if (string.charAt(i)!= 'a' && string.charAt(i)!= 'e' && string.charAt(i)!= 'i' && string.charAt(i)!= 'o' && string.charAt(i)!= 'u'){
                counter++;
            }
        }
        return counter;
    }

    // 5)
    public static boolean isPrime(int num) {

        for (int i = 2; i<=num/2 ; i++) {

            if (num % i == 0) {
                return false;
            }
            
        }
        return true;
    }

    // 6)
    public static ArrayList<Integer> highLow(ArrayList<Integer> arrayList) {
        
    }

}

