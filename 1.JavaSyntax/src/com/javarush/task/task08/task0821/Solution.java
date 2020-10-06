package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Вася");
        map.put("Петров", "Петя");
        map.put("Сидоров", "Федя");
        map.put("Петров", "Коля");
        map.put("Дерябин", "Петя");
        map.put("Гунин", "Даня");
        map.put("Кузнецов", "Ваня");
        map.put("Кузькин", "Дима");
        map.put("Иванов", "Ваня");
        map.put("Пергаев", "Петя");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
