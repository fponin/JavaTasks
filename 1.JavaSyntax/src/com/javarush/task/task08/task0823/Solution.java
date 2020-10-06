package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String upperString = "";

        String[] strings = string.split(" ");
        for (String s : strings) {
            if (!s.equals("")) {
                upperString += s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
            } else
                upperString += " ";
        }

        System.out.println(upperString);
    }
}
