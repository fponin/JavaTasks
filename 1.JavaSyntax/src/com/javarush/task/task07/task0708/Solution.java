package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String maxStringLength = strings.get(0);
        for (String s : strings) {
            if (maxStringLength.length() < s.length())
                maxStringLength = s;
        }
        for (String s : strings) {
            if (s.length() == maxStringLength.length())
                System.out.println(s);
        }
    }
}
