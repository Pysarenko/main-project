package com.dev.mainproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListImplTest {
    @Test
    void arrayTest() {
        MyArrayListImpl<String> myArrayList = new MyArrayListImpl<>();
        myArrayList.add("String1");
        myArrayList.add("String2");
        myArrayList.add("String3");
        myArrayList.add("String4");
        myArrayList.add("String5");
        myArrayList.add("String6");
        myArrayList.add("String7");
        myArrayList.add("String8");
        myArrayList.add("String9");
        myArrayList.add("String10");
        myArrayList.add("String11");
        myArrayList.add("String12");

        myArrayList.remove(1);

        myArrayList.get(7);

        //myArrayList.remove("String3");
        MyArrayList<Integer> integerList = new MyArrayListImpl<>();
        integerList.add(1);

    }

}