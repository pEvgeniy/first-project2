package ru.mpei.lesson5;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Ivan");
        names.add("Andrei");
        names.add("Ivan");
        names.add("Anton");
        names.add("Andrei");

        System.out.println(names);
//        [Anton, Andrei, Ivan]
    }
}
