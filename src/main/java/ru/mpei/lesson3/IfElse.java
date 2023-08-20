package ru.mpei.lesson3;

import java.util.Random;

public class IfElse {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(10);
        int b = random.nextInt(10);

        if (a > b) {
            System.out.println("a = " + a + " > b = " + b);
        } else if (a < b) {
            System.out.println("a = " + a + " < b = " + b);
        } else {
            System.out.println("a = " + a + " == b = " + b);
        }
    }
}
