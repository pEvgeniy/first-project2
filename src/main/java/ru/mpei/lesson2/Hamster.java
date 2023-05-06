package ru.mpei.lesson2;

import java.util.Objects;

public class Hamster {
    private String name;
    private int age;
    private double weighInKg;

    public Hamster(String name, int age, double weighInKg) {
        this.name = name;
        this.age = age;
        this.weighInKg = weighInKg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeighInKg() {
        return weighInKg;
    }

    public void setWeighInKg(double weighInKg) {
        this.weighInKg = weighInKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamster hamster = (Hamster) o;
        return age == hamster.age && Double.compare(hamster.weighInKg, weighInKg) == 0 && Objects.equals(name, hamster.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weighInKg);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weighInKg=" + weighInKg +
                '}';
    }

    public static void main(String[] args) {
        Hamster homa = new Hamster("Хома", 2, 0.2);

        System.out.println(homa);
//        Hamster{name='Хома', age=2, weighInKg=0.2}
    }
}

