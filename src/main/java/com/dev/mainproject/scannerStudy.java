package com.dev.mainproject;

import java.util.Scanner;

public class scannerStudy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How are you feeling?");
        String feeling = scanner.nextLine();
        System.out.println(feeling + " is not bad!");

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println(age + "? Repeat, please.");
        int age2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Write your name!!!!!!!!!");
        String name2 = scanner.nextLine();
        System.out.println("Hello " + name2);
    }
}
