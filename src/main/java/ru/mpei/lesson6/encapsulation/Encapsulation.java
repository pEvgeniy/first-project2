package ru.mpei.lesson6.encapsulation;

public class Encapsulation {
    public String helloString = "Hello!";
    protected int number = 0;
    boolean isMonday = true;

    public static void main(String[] args) {
        printHello();
    }

    private static void printHello() {
        System.out.println("Hello!");
    }
}
