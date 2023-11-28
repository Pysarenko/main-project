package com.dev.mainproject;


public class MyArrayListImpl implements MyArrayList {


    public MyArrayListImpl() {
    }

    String[] array = new String[10];


    @Override
    public void add(String input) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = input;
                break;
            }
            else if (i == array.length - 1) {
                String[] newArray = new String[array.length*2];
                System.arraycopy(array, 0, newArray, 0, array.length);
                array = newArray;
            }
        }
    }

    @Override
    public String get(int index) {
        return array[index];
    }

    @Override
    public void remove(int index) {
        array[index] = null;
    }

    @Override
    public void remove(String input) {
        for (int i = 0; i < 10; i++) {

            if (array[i] != null && array[i].equals(input)) {
                array[i] = null;
                break;
            }
        }
    }
}
