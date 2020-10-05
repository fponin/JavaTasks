package com.javarush.task.task08.task0815;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        return Collections.frequency(map.values(), name);

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        return Collections.frequency(map.keySet(), lastName);

    }

    public static void main(String[] args) {


    }
}
