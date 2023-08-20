package ru.mpei.exceptions;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(
                1, "First",
                2, "Second",
                3, "Third"
        );
        Random randomInt = new Random();

        while (true) {
            try {
                mapValidator(map, randomInt.nextInt(10));
            } catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        System.out.println("Конец!");
    }

    private static void mapValidator(Map<Integer, String> map, Integer index) {
        if (!map.containsKey(index)) {
            throw new NoSuchElementException("Такого ключа нет!");
        }
    }

    private static void throwerValidator(Map<Integer, String> map, Integer index) {
        map.get(index);
    }
}
