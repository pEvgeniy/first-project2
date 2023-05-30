package ru.mpei.lesson6.abstraction.abstractclass;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Musya");
        cat.eat();
        cat.sound();
        System.out.println("\n");

        Dog dog = new Dog("Bobik");
        dog.eat();
        dog.sound();
        System.out.println("\n");
    }
}
