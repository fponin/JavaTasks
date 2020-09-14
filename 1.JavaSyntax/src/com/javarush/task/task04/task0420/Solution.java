package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int[] array = {a, b, c};
        Arrays.sort(array);
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i-1]+ " ");
        }

    }
}
