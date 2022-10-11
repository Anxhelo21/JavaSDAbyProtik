package org.example;

import java.util.Scanner;

public class RandomUtils {

    //return a random number between -10 and 10;
    public static int getRandomNumber(int high, int low) {

        int number = (int) (Math.random() * (high - low)) + low; //Math.random() gives a value between 0<=x<1
        //a = number*20 -> [0,20]
        //10-a -> [-10,10]
        return number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int low = sc.nextInt();

        System.out.println(getRandomNumber(high,low));

    }
}
