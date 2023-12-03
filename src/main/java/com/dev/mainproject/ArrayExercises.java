package com.dev.mainproject;

public class ArrayExercises {
//    3,1,0
    public static int[] sort(int[] arr) {
//       0,1,3
        for (int k = 0; k < arr.length ; k++) {
            for (int i = 0; i < (arr.length - 1); i++) {
                int j = arr[i];
                if (arr[i] > arr[i+1]) {
                    arr[i] = arr[i+1];
                    arr[i+1] = j;
                }
            }
        }
        return arr;
    }

    //Figure it out!!
    public static int[][] sort(int[][] arr) {
        for (int[] arrs: arr) {
            for (int arrsTwo: arrs) {
                 int k = arr[i][j];
                 if (arr[i][j] > arr[i][j+1]) {
                     arr[i][j] = arr[i][j+1];
                     arr[i][j+1] = k;
                 }
            }
        }
        return arr;
    }

}
