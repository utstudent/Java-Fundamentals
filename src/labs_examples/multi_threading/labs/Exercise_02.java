package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_02 {
    public static void main(String[] args) {
        FirstThread thread1 = new FirstThread("Thread 1");
        thread1.setPriority(10);

        FirstThread thread2 = new FirstThread("Thread 2");
        thread2.setPriority(5);
        FirstThread thread3 = new FirstThread("Thread 3");
        thread3.setPriority(1);

        SecondThread thread4 = new SecondThread("Thread 4");
        SecondThread thread5 = new SecondThread("Thread 5");
        SecondThread thread6 = new SecondThread("Thread 6");
    }
}

class FirstThread extends Thread{

    FirstThread(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        System.out.println(getName() + " starting");
        try {
            for(int count=0; count < 5; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " finished");
    }
}

class SecondThread extends Thread{

    SecondThread(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        System.out.println(getName() + " starting");
    }
}

