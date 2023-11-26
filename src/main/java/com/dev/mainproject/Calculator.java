package com.dev.mainproject;

public class Calculator {
    public static void main(String[] args) {
        float x, y, z=0;
        x = Float.parseFloat(args[0]);
        y = Float.parseFloat(args[2]);
        String operator = args[1];

        z = switch (operator) {
            case "+" -> x + y;
            case "*" -> x * y;
            case "-" -> x - y;
            case "/" -> x / y;
            default -> z;
        };

//        if (operator.equals("+")) {
//            z = x + y;
//        }
//        if (operator.equals("*")) {
//            z = x * y;
//        }
//        if (operator.equals("-")) {
//            z = x - y;
//        }
//        if (operator.equals("/")) {
//            z = x / y;
//        }

        System.out.println(z);
    }
}
