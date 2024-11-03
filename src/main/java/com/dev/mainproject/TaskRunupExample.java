package com.dev.mainproject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TaskRunupExample {
    public static void main(String[] args) {
        /*
        Given an array of strings,
        find the longest (1) string that has its reversed (2) version  in the array.
         If no such string exists, return an empty (3) string.
        A string is considered reversed if it reads the same backward as forward (e.g., "abc" and "cba").
         */

        String[] strings1 = {"123", "abc", "xyz", "cba", "zyx"}; // "abc"
        String[] strings2 = {"ab", "world", "hello", "ba", "olleh", "test"}; // "hello"
        String[] strings3 = {"abc", "def", "ghi"}; // empty ""

        System.out.println(findReversed(strings2));
    }

    public static String findReversed(String[] strings) {

        if (strings.length ==0) {
            return "";
        }

        Set<String> set = Arrays.stream(strings)
                .map(e -> new StringBuilder(e).reverse().toString())
                .collect(Collectors.toCollection(
                        () -> new TreeSet<>(Comparator
                                .comparing(String::length)
                                .reversed()
                                .thenComparing(Comparator.naturalOrder()))));

        System.out.println(set.toString());

        for (String el : set) {
            for (String string : strings) {
                if (el.equals(string)) {
                    return string;
                }
            }
        }

        return "";
    }
}
