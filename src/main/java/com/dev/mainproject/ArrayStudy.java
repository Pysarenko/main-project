package com.dev.mainproject;

public class ArrayStudy {
    public static void main(String[] args) {
        ArrayStudy createArray = new ArrayStudy();
        System.out.println(ArrayStudy.createArray());

        ArrayStudy createStringArray = new ArrayStudy();
        System.out.println(ArrayStudy.createStringArray());
    }

    public static String createArray() {
        // Create new Array
        int[] myArr = new int[10];
        int middleIndex = 0,
                sumArrValues = 0,
                arithmeticMean = 0;

        for (int i = 0; i < 10; i++) {
            myArr[i] = i*2;
            middleIndex = i/2;
            sumArrValues = sumArrValues + myArr[i];
        }

        arithmeticMean = sumArrValues/2;

        return middleIndex + "," + arithmeticMean + "," + sumArrValues + "," + myArr.length;
    }

    public static StringBuilder createStringArray() {
        // Example from W3
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        StringBuilder names = new StringBuilder();
        for (String i : cars) {
//            System.out.println(i);
            names.append(i);
            names.append(" ");
        }
        return new StringBuilder(names.toString());
    }
}
