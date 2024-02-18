package com.dev.mainproject;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogicTest {



    @Test
    void biggestDuplicateTest(){
        var integers = List.of(1, 2, 4, 2, 6, 8, 9, 9);
        int result = biggestDuplicate(integers);
        assertEquals(9,result);

    }

    @Test
    void countWordsTest(){
        String input = "word1 word2,     ,    word3, word4;word5.word";
        int result = countWords(input);
        assertEquals(6,result);
    }

    @Test
    void commonPrefixTest(){
        String[] arr = {""};
        String result = commonPrefix(arr);
        assertEquals("", result);
    }

    @Test
    void numberOfSteps(){
        int result = numberOfSteps(3);
        assertEquals(3, result);
    }

    int counter = 0;
    public int numberOfSteps(int num) {
        if (num == 0) { return counter; }
        if (num%2 == 0) { num /= 2; }
        else { num--; }
        counter++;
        numberOfSteps(num);
        return counter;
    }

        public String commonPrefix(String[] strs) {
            String prefix = "";
            String s;
            boolean condition = true;
            if (strs.length == 1) {
                prefix = strs[0];
                return prefix;
            } else if (strs.length == 0) {
                return prefix;
            }
            for (int i = 0; condition; i++) {
                s = "";
                for (int j = 0; j < (strs.length - 1); j++) {
                    if (strs[j].isEmpty()) {
                        return prefix;
                    }
                    if ((strs[j].length() <= i) || (strs[j + 1].length() <= i)) {
                        return prefix;
                    }
                    if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
                        s = String.valueOf(strs[j].charAt(i));
                    } else {
                        s = "";
                        condition = false;
                        break;
                    }
                }
                prefix = prefix + s;
            }
            return prefix;
        }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (String s : strs)
            while (s.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
    }
    private int countWords(String input) {
        String[] result = input.split("[^A-Za-z0-9]+");

        return result.length;
    }

    private int biggestDuplicate(List<Integer> integers) {
        int result = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < integers.size(); i++) {
            if (stack.contains(integers.get(i))) {
                if (integers.get(i) > result) {
                    result = integers.get(i);
                }
            } else {
                stack.add(integers.get(i));
            }
        }

        /*for (int i = 0; i < (integers.size() - 1); i++) {

            for (int j = i+1; j < integers.size(); j++) {
                if(Objects.equals(integers.get(i), integers.get(j))) {
                    if(integers.get(i) > result) {
                        result = integers.get(i);
                    }
                }
            }
        }*/

        return result;
    }


}
