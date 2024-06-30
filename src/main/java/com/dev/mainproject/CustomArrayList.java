package com.dev.mainproject;

public class CustomArrayList {

    int size = 10;
    int index = 0;
    int[] innerArray = new int[size];

    //add
    void add(Integer myInt) {
        if (index==innerArray.length) {
            int newSize = size*2;
            int[] newInnerArray = new int[newSize];

            System.arraycopy(innerArray, 0, newInnerArray, 0, size);

            size = newSize;
            innerArray = newInnerArray;
        }

        innerArray[index] = myInt;
        index++;

    }

    public int getByIndex(int index) {
        int elementByIndex = innerArray[index];
        return elementByIndex;
    }

}

