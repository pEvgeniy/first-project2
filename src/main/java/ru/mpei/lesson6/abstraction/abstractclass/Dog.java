package ru.mpei.lesson6.abstraction.abstractclass;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}
