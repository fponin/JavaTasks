package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Путин", 300);
        map.put("Галкин", 6890);
        map.put("Пугачева", 100);
        map.put("Пресняков", 10);
        map.put("Киркоров", 1000);
        map.put("Васечкин", 6789);
        map.put("Петечкин", 1000);
        map.put("Сидоров", 158);
        map.put("Петров", 894);
        map.put("Иванов", 56787);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}