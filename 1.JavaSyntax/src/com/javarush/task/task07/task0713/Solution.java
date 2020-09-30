package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> num3 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        for (Integer s : list) {
            if (s % 3 == 0) num3.add(s);
            if (s % 2 == 0) num2.add(s);
            if (s % 2 != 0 & s % 3 != 0) num.add(s);
        }
        printList(num3);
        printList(num2);
        printList(num);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
