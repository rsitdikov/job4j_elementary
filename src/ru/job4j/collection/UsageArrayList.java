package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of(
                "Petr", "Ivan", "Stepan"
        ));
        for (String name:names) {
            System.out.println(name);
        }
    }
}
