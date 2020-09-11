package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String dayOfYear = "количество дней в году: 365";
        String dayOfLeapYear = "количество дней в году: 366";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());

        if (year % 400 == 0) {
            System.out.println(dayOfLeapYear);
        } else if (year % 100 == 0) {
            System.out.println(dayOfYear);
        } else if (year % 4 == 0) {
            System.out.println(dayOfLeapYear);
        } else
            System.out.println(dayOfYear);
    }
}