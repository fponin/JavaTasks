package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number >= 100 && number < 1000) {
            if (number % 2 == 0) {
                System.out.println("четное трехзначное число");
            } else
                System.out.println("нечетное трехзначное число");
        } else if (number >= 10 && number < 100) {
            if (number % 2 == 0) {
                System.out.println("четное двузначное число");
            } else
                System.out.println("нечетное двузначное число");
        } else if (number > 0 && number < 10) {
            if (number % 2 == 0) {
                System.out.println("четное однозначное число");
            } else
                System.out.println("нечетное однозначное число");
        }

    }
}
