package com.dev.mainproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class MainProjectApplication {
    public static void main(String[] args) {
/*        List<String> arrayList = new ArrayList<>();
        List<String> linkedList= new LinkedList<>();
        SpringApplication.run(MainProjectApplication.class, args);*/

        String s = "Hello";
        String t = new String("Hello");

        if(s == t) System.out.println("one");
        if(s.equals(t)) System.out.println("two");

        int [] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (arr[i] - 0.1);
        }

        System.out.println(Arrays.toString(arr));
    }

}
