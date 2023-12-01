package com.dev.mainproject;

import org.junit.jupiter.api.Test;

import static com.dev.mainproject.ArrayExercises.sort;
import static org.junit.jupiter.api.Assertions.*;

class ArrayExercisesTest {
    @Test
    void arrayTest() {
        int[] sorted = sort(new int[]{1, 2, 6, 3, 10, 5, 7});
        assertArrayEquals(new int[]{1,2,3,5,6,7,10},sorted);
    }

}