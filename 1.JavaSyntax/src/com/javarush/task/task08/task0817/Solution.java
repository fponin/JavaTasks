package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Вася");
        map.put("Петров", "Петя");
        map.put("Сидоров", "Федя");
        map.put("Васнецов", "Коля");
        map.put("Дерябин", "Петя");
        map.put("Гунин", "Даня");
        map.put("Кузнецов", "Ваня");
        map.put("Кузькин", "Дима");
        map.put("Весечкин", "Ваня");
        map.put("Пергаев", "Петя");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (Collections.frequency(map.values(), pair.getValue()) > 1) {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
