package com.dev.mainproject;

public class ThreadDemoTwo extends Thread {
    ThreadDemoTwo() {
        System.out.println(" My Thread");
    }

    public void run() {
        System.out.println(" bar");
    }

    public void run(String a) {
        System.out.println(" baz");
    }
}

class ThreadDemoTest {
    public static void main(String[] args) {
        Thread t = new ThreadDemoTwo() {
            public void run() {
                System.out.println(" foo");
            }
        };
        t.start();
    }
}
