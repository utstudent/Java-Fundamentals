package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

// ask jon for help on this
class Exercise_05 {
    public static void main(String[] args) {

        Counter5 counter = new Counter5();
        Thread countFirst = new Thread(new ThreadCount5_1(100,counter));
        Thread countSecond = new Thread(new ThreadCount5_2(100,counter));

        countFirst.start();
        countSecond.start();

    }
}

class Counter5 {

    int i = 1;
    private boolean goCount = true;


    public synchronized void count1(){

        while(!goCount){
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Thread interrupted.");
            }
        }
        goCount = false;
        this.i++;
        notifyAll();
    }

    public synchronized void count2(){

        while(goCount){
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Thread interrupted.");
            }
        }
        goCount = true;
        this.i++;
        notifyAll();
    }
}


class ThreadCount5_1 implements Runnable{
    //Thread thread;
    Counter5 counter;
    //int num;

    public ThreadCount5_1( int num, Counter5 counter){
        //thread = new Thread(this);
        //this.num = num;
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) { // synchronized word make them take turns
            counter.count1();
        }
        //counter.count(num); this would make it go at the same time

//        counter.count1();

    }
}

class ThreadCount5_2 implements Runnable{
    // Thread thread;
    Counter5 counter;
    //int num;

    public ThreadCount5_2( int num, Counter5 counter){
        //thread = new Thread(this);
        //this.num = num;
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) { // synchronized word make them take turns
            counter.count2();
        }
        //counter.count(num); this would make it go at the same time

        //counter.count2();

    }
}

