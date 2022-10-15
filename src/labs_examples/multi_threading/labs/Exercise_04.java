package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Exercise_04 {
    public static void main(String[] args) {

        Counter counter = new Counter();
        ThreadCount threadCount = new ThreadCount(5, counter);
        ThreadCount threadCount2 = new ThreadCount(7, counter);

        threadCount.thread.start();
        threadCount2.thread.start();

    }
}

class Counter {
    public void count(int num){
        for (int i = 1; i<=num; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}


class ThreadCount implements Runnable{
    Thread thread;
    Counter counter;
    int num;
    public ThreadCount( int num, Counter counter){
        thread = new Thread(this);
        this.num = num;
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) { // synchronized word make them take turns
            counter.count(num);
        }
        //counter.count(num); this would make it go at the same time

    }
}