package com.dev.mainproject;

import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class LambdaDemo {

    public static void main(String[] args) {
        var test = test(10);
        Function<Integer, Integer> integerIntegerFunction = integer -> integer * 10;
        List.of(1,2,3).stream().map(LambdaDemo::test).map(integerIntegerFunction).map(intvar -> intvar*100).forEach(System.out::println);
        // 3 ways of using lambda:
        //LambdaDemo::test -
        //integerIntegerFunction - передача ламбди в якості аргумента
        //intvar -> intvar*100

        //Function<Integer, Integer> - один з функціональних інтерфейсів
    }

    public static int test(int num) {
        FuncDemo result;
        result = (n) -> num*2;
        return result.func(num);
    }
}

interface FuncDemo {
    int func(int n);
}

