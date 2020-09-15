package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println(findMid(a,b,c));

    }

    private static int findMid(int a, int b, int c) {
        int mid;
        int summ;
        int max;
        int min;

        summ = a+b+c;
        max = Math.max(Math.max(a,b),c);
        min = Math.min(Math.min(a,b),c);

        mid = summ - max - min;

        return mid;
    }
}
