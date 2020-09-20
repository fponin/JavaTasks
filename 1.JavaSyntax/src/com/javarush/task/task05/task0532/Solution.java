package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            ArrayList arr = new ArrayList(n);
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(reader.readLine());
                arr.add(num);
            }
            Collections.sort(arr);
            System.out.println(arr.get(n-1));
        }
    }
}