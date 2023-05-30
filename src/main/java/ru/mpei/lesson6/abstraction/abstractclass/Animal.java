package ru.mpei.lesson6.abstraction.abstractclass;

public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound();

    public void eat() {
        System.out.println(name + " is eating.");
    }
}
