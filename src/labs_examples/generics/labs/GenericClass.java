package labs_examples.generics.labs;

import sun.net.www.content.text.Generic;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */


class GenericClass<T> {

    private T val;
    private T val2;

    public GenericClass(T val, T val2) {
        this.val = val;
        this.val2 = val2;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "val=" + val +
                ", val2=" + val2 +
                '}';
    }
}


class Main{
    public static void main(String[] args) {

        GenericClass <String> name = new GenericClass<String>("Tony", "Bob");
        System.out.println(name);
        System.out.println("--------------------------------");

        GenericClass <Integer> number = new GenericClass<Integer>(21, 18);
        System.out.println(number);
    }
}