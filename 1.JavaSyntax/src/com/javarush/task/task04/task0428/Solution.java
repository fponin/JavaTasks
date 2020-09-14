package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int num1 = Integer.parseInt(reader.readLine());
        if (num1 > 0) {
            count++;
        }
        int num2 = Integer.parseInt(reader.readLine());
        if (num2 > 0) {
            count++;
        }
        int num3 = Integer.parseInt(reader.readLine());
        if (num3 > 0) {
            count++;
        }
        System.out.println(count);

    }
}
