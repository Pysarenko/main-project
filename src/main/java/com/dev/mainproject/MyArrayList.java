package com.dev.mainproject;

public interface MyArrayList <T> {
    //contract:
    void add(T input);

    T get(int index);

    void remove(int index);

    void remove(T input);
    // end contract

}
