package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double timeToStartHour = Double.parseDouble(reader.readLine());
        double res = timeToStartHour % 5;
        if (res < 3) {
            System.out.println("зеленый");
        } else if (res < 4) {
            System.out.println("жёлтый");
        } else
            System.out.println("красный");
    }
}