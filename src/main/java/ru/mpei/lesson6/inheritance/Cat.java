package ru.mpei.lesson6.inheritance;

public class Cat extends Animal {

    protected String name;

    public Cat(double weight, double age, String name) {
        super(weight, age);
        this.type = "Cat";
        this.name = name;
    }

    @Override
    protected void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    protected void sleep() {
        System.out.println(name + " is sleeping");
    }

    protected void play() {
        System.out.println(name + " is playing");
    }
}
