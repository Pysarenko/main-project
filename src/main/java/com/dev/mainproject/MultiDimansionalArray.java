package com.dev.mainproject;

public class MultiDimansionalArray {
    public static void main(String[] args) {
        int[][] twoDimansionalArr = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                twoDimansionalArr[i][j] = i+j;
                //System.out.print(twoDimansionalArr[i][j] + " ");
            }
            //System.out.println();
        }

        int[][] patchyArr = new int[4][];
        int random = (int) (Math.random()*101);

        for (int i = 0; i < 4; i++) {
            patchyArr[i] = new int[random];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < patchyArr[i].length; j++) {
                System.out.print(patchyArr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
