package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int positiveCount = 0;
        int negativeCount = 0;

        int num1 = Integer.parseInt(reader.readLine());
        if (num1 > 0) {
            positiveCount++;
        } else if (num1 < 0) {
            negativeCount++;
        }
        int num2 = Integer.parseInt(reader.readLine());
        if (num2 > 0) {
            positiveCount++;
        } else if (num2 < 0) {
            negativeCount++;
        }
        int num3 = Integer.parseInt(reader.readLine());
        if (num3 > 0) {
            positiveCount++;
        } else if (num3 < 0) {
            negativeCount++;
        }
        System.out.println("количество отрицательных чисел: " + negativeCount);
        System.out.println("количество положительных чисел: " + positiveCount);
    }
}
