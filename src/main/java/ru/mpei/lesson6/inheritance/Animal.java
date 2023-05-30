package ru.mpei.lesson6.inheritance;

public class Animal {
    protected String type;
    protected double weight;
    protected double age;

    public Animal(double weight, double age) {
        this.weight = weight;
        this.age = age;
    }

    protected void eat() {
        System.out.println("Eating");
    }

    protected void sleep() {
        System.out.println("Sleeping");
    }
}
