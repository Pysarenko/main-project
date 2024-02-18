package com.dev.mainproject;

import java.sql.SQLOutput;

public class ThreadDemo extends Thread {
    final StringBuffer sb1 = new StringBuffer();
    final StringBuffer sb2 = new StringBuffer();


    public static void main(String[] args) {
        final ThreadDemo h = new ThreadDemo();

        new Thread() {
            public void run() {
                synchronized (this) {
                    h.sb1.append("Java");
                    h.sb2.append("Thread");
                    System.out.println(h.sb1);
                    System.out.println(h.sb2);
                }
            }
        }.start();

        new Thread() {
            public void run() {
                synchronized (this) {
                    h.sb1.append("MultiThreading");
                    h.sb2.append("Example");
                    System.out.println(h.sb2);
                    System.out.println(h.sb1);
                }
            }
        }.start();

//        Test t = new Test();
//        Test t2 = new Test();
//        t.start();
//        t2.start();
    }


}

class Test extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from thread "+ currentThread().getName());
    }
}
