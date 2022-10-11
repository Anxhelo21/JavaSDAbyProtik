package org.example;

public class Calculator {

    public static int sum(int a, int b){
        return a+b;
    }

    public static double div(int a, int b){
        return (double) a/b;
    }

    public static int prod(int a, int b){
        return a*b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result = calc.sum(1,2);

    }
}
