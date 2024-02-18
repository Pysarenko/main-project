package com.dev.mainproject;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        var numbers1 = doSomthing(numbers);
        System.out.println(numbers1.get(1));
        System.out.println(numbers1.get(0).getClass().getSimpleName());
        System.out.println(numbers1.get(1));
        System.out.println(numbers1.get(1).getClass().getSimpleName());
    }

   static List<? super Number> doSomthing(List<? super Number> input){

        input.add(1);
        input.add(2L);
        return input;
    }


}
