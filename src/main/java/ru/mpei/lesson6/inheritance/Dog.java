package ru.mpei.lesson6.inheritance;

public class Dog extends Cat {

    public Dog(double weight, double age, String name) {
        super(weight, age, name);
        this.type = "Dog";
        this.name = name;
    }

    protected void defend() {
        System.out.println(name + " is defending house");
    }
}
