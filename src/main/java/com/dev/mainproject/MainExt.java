package com.dev.mainproject;

public class MainExt {
    public static void main(String[] args) {
        A a = new B();
        a.m();

    }
}

class A {
     static {
         System.out.println("Hello from static A");
     }

     A(){
         System.out.println("Hello from constructor A");
     }
    void m() {
        System.out.println("A");
    }
}

class B extends A {

    static {
        System.out.println("Hello from static B");
    }

    B() {
        System.out.println("Hello from constructor B");
    }

    void m() {
        System.out.println("B");
        super.m();
    }
}
