package ru.mpei.lesson6.abstraction.abstractclass;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}
