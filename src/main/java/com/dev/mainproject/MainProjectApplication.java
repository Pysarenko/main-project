package com.dev.mainproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class MainProjectApplication {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList= new LinkedList<>();


        SpringApplication.run(MainProjectApplication.class, args);
    }

}
