package com.dev.mainproject;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.dev.mainproject.ArrayExercises.sort;
import static org.junit.jupiter.api.Assertions.*;

class ArrayExercisesTest {
    @Test
    void arrayTest() {
        int[] sorted = sort(new int[]{1, 2, 6, 3, 10, 5, 7});
        assertArrayEquals(new int[]{1,2,3,5,6,7,10},sorted);
    }

    @Test
    void arrayTestTwoD() {
        int[][] sorted = sort(new int[][]{{8, 1, 2, 6, 3, 10, 5, 7}, {7, 5, 9, 1}});
//        assertArrayEquals(new int[]{1,2,3,5,6,7,10},sorted);
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted[i].length; j++) {
                System.out.print(sorted[i][j] + " ");
            }
            System.out.println();
        }
    }


}