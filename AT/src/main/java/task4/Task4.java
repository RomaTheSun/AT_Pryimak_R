package task4;

import java.util.concurrent.CountDownLatch;

public class Task4 {
    public static void main(String[] args) {
        int Threads = 76;
        CountDownLatch countDownLatch = new CountDownLatch(Threads);

        for (int i = 0; i < Threads; i++) {
            new Thread(new Worker(countDownLatch)).start();
        }

        try {
            countDownLatch.await();
            System.out.println("Finished");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Worker implements Runnable {
    private CountDownLatch latch;

    public Worker(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is working.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
        System.out.println(Thread.currentThread().getName() + " finished work.");
    }
}

//V10.
//a)	Use a CountDownLatch to wait for a set of threads to complete before continuing execution in the main thread.
//b)	Create your own custom class, and make an object for it. Use getDeclaredMethods() to print out all the methods of the class and their return types. Choose a specific method by name and call it using invoke(). Print out your results of invoking.
//c)	Create a generic method that takes two parameters of any type, and returns the larger one using T extends Comparable<T> and compareTo().