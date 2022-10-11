package org.example;

public class Fibonacci {

    public static int getValue(int element) {
        if (element == 0 || element == 1) {
            return element;
        }

        return getValue(element - 2) + getValue(element - 1);
    }
}
