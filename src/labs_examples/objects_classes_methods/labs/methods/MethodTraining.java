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
        System.out.println("------------------------------------");

        // 3
        int result = highest(4,9,31,66);
        System.out.println("The highest number is: " + result);
        System.out.println("------------------------------------");

        // 4
        int totalConsonants = consonantCounter("Apple");
        System.out.println("Total number of consonants is " + totalConsonants);
        System.out.println("------------------------------------");

        // 5
        int sample = 17;
        boolean isPrime = isPrime(sample);
        System.out.println("The number " + sample +" is prime. T/F? ---> " + isPrime);
        System.out.println("------------------------------------");

        // 6
        ArrayList<Integer> oldList = new ArrayList<>();
        oldList.add(3);
        oldList.add(76);
        oldList.add(93);
        oldList.add(35);
        oldList.add(56);

        ArrayList<Integer> newList = highLow(oldList);
        System.out.println(newList);
        System.out.println("------------------------------------");

        // 7
        ArrayList<Integer> sevenList = numberSeven(34, 3,2);
        System.out.println(sevenList);
        System.out.println("The length of the list is " + sevenList.size());
        System.out.println("------------------------------------");

        // 8
        ArrayList<Integer> eightList = new ArrayList<>();
        eightList.add(1);
        eightList.add(2);
        eightList.add(3);
        eightList.add(4);
        eightList.add(5);
        eightList.add(6);

        ArrayList<Integer> eightNewList = reverseArray(eightList);
        System.out.println(eightNewList);


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
    public static ArrayList<Integer> highLow(ArrayList<Integer> inputList) {

        ArrayList<Integer> result = new ArrayList<>();
        int highest = inputList.get(0);
        int lowest = inputList.get(0);

        for (int i = 0; i<inputList.size(); i++) {
            if(inputList.get(i)> highest) {
                highest = inputList.get(i);
            }
            if(inputList.get(i)< lowest) {
                lowest = inputList.get(i);
            }
        }

        result.add(highest);
        result.add(lowest);

        return result;
    }

    // 7)
    public static ArrayList<Integer> numberSeven(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<=maxNum; i++) {

            if(i%divisor1 == 0 && i%divisor2 == 0) {
                list.add(i);
            }
        }

        return list;

    }

    // 8)
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> originalList) {
        int temp = 0;

        for (int i = 0; i < originalList.size()/2; i++) {
            temp = originalList.get(i);
            originalList.set(i,originalList.get(originalList.size()-(1+i)));
            originalList.set(originalList.size()-(1+i),temp);

        }
        return originalList;
    }

}

