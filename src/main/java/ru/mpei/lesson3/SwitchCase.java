package ru.mpei.lesson3;

import java.util.Random;

public class SwitchCase {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(6);

        switch (a) {
            case 0:
                System.out.println("case 0, a = " + a);
                break;
            case 1:
                System.out.println("case 1, a = " + a);
                break;
            case 2:
                System.out.println("case 2, a = " + a);
                break;
            case 3:
                System.out.println("case 3, a = " + a);
                break;
            case 4:
                System.out.println("case 4, a = " + a);
                break;
            case 5:
                System.out.println("case 5, a = " + a);
                break;
            default:
                System.out.println("default, a = " + a);
                break;
        }
    }
}
