package com.dev.mainproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;

public class ReadFromFile {

    public static void main(String[] args) {
        String s;
        Path path = Path.of("C:\\Users\\pisar\\IdeaProjects\\main-project\\10m.txt");

        try {
            s = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<String> arr = new ArrayList<>();
        arr = List.of(s.split("\\r?\\n|\\r"));

        OptionalInt resultMax = arr.stream().mapToInt(Integer::parseInt).max();
        OptionalInt resultMin = arr.stream().mapToInt(Integer::parseInt).min();
        OptionalDouble resultAverage = arr.stream().mapToInt(Integer::parseInt).average();

        System.out.println("Max: " + resultMax);
        System.out.println("Min: " + resultMin);
        System.out.println("Average: " + resultAverage);
    }


}
