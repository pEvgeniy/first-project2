package ru.mpei.lesson2;

public class Person {
    static int count = 0;
    String name;

    public Person(String name) {
        this.name = name;
        count++;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Alice");
        System.out.println("Количество людей: " + Person.count);
//        Количество людей: 2
    }
}
