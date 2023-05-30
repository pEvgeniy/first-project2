package ru.mpei.lesson6.inheritance;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal(10.2, 3);
        animal.eat();
        animal.sleep();
        System.out.println("\n");

        Cat cat = new Cat(3.1, 5, "Musya");
        System.out.println(cat.type);
        cat.eat();
        cat.sleep();
        cat.play();
        System.out.println("\n");

        Dog dog = new Dog(5.1, 7, "Bobik");
        System.out.println(dog.type);
        dog.eat();
        dog.sleep();
        dog.play();
        dog.defend();
    }
}
