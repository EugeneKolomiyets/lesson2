package com.alevel.adv.lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int myAge = 36;
        String myName = "Eugene";
        double myWeight = 99.9;
        float myHeight = 1.83f;

        System.out.println("Hello " + myName);
        System.out.println("Your age is " + myAge);

        if (myAge > 40) {
            System.out.println("Let's have a pension");
        } else {
            System.out.println("Your brain still nice, no bemused");
        }

        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }
}
