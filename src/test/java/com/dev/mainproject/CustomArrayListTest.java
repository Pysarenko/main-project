package com.dev.mainproject;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {
    CustomArrayList customArrayList = new CustomArrayList();

    @Test
    void add() {
        customArrayList.add(7);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(9);
        customArrayList.add(9);
        customArrayList.add(9);
        customArrayList.add(9);
        customArrayList.add(9);
        customArrayList.add(9);
        customArrayList.add(9);
        customArrayList.add(9);
        customArrayList.add(9);
        customArrayList.add(9);
        customArrayList.add(3);



        assertEquals(7, customArrayList.getByIndex(0));
    }
}