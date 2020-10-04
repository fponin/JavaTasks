package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 5; i < 25; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copySet = new HashSet<>(set);
        for (Integer number : copySet) {
            if (number > 10)
                set.remove(number);
        }
        return set;
    }

    public static void main(String[] args) {
    }
}
