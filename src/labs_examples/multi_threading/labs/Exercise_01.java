package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class Exercise1{
    public static void main(String[] args) {

        FirstRunnable thread1 = new FirstRunnable("First Runnable"); //staring in the constructor
        SecondRunnable thread2 = new SecondRunnable("Second Runnable");
        thread2.thread.start(); //starting outside the method

    }
}

class FirstRunnable implements Runnable{

    Thread thread;

    public FirstRunnable(String name){

        thread = new Thread(this,name);
        thread.start();
    }

    @Override
    public void run() {

        System.out.println("Printing Runnable 1");

    }
}

class SecondRunnable implements Runnable{

    Thread thread;

    public SecondRunnable(String name){

        thread = new Thread(this,name);

    }

    @Override
    public void run() {

        System.out.println("Printing Runnable 2");

    }
}


