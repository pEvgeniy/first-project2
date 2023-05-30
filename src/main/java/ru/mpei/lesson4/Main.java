package ru.mpei.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hamster> hamsters = new ArrayList<>();

        Hamster homa = new Hamster("Homa", 2, 0.2);
        Hamster chip = new Hamster("Chip", 1, 0.25);
        Hamster bobik = new Hamster("Bobik", 3, 0.3);

        hamsters.add(homa);
        hamsters.add(chip);
        hamsters.add(bobik);

        for (Hamster hamster : hamsters) {
            if ("Homa".equals(hamster.name)) {
                System.out.println("Мы нашли Хому!");
            }
            if (hamster.age > 1) {
                System.out.println("Мы нашли хомяка старше 1 года! Это " + hamster.name);
            }
            if (hamster.weighInKg != 0.2) {
                System.out.println("Мы нашли хомяка, у которого вес не равен 0.2 кг! Это " + hamster.name);
            }
        }
    }

    public static class Hamster {
        private String name;
        private int age;
        private double weighInKg;

        public Hamster(String name, int age, double weighInKg) {
            this.name = name;
            this.age = age;
            this.weighInKg = weighInKg;
        }

        @Override
        public String toString() {
            return "Hamster{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weighInKg=" + weighInKg +
                    '}';
        }
    }
}
