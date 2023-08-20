package ru.mpei.lesson5;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> group = new HashMap<>();
//        Map<Integer, String> group = new LinkedHashMap<>();
        group.put(1, "Ivan");
        group.put(2, "Natalia");
        group.put(3, "Andrei");

//        Выводим все значения в цикле
        for (String name : group.values()) {
            System.out.println(name);
        }
//        Выводим все ключи в цикле
        for (Integer number : group.keySet()) {
            System.out.println(number);
        }
//        Получаем доступ и к ключам, и к значениям
        for (Map.Entry<Integer, String> groupEntry : group.entrySet()) {
            int key = groupEntry.getKey();
            String value = groupEntry.getValue();
            System.out.println("key: " + key + ", value " + value);
        }
    }
}