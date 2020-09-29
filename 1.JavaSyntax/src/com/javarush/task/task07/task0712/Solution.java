package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }

        String min = arrayList.get(0);
        String max = arrayList.get(0);

        for (String s : arrayList) {
            if (min.length() < s.length())
                min = s;
        }

        for (String s : arrayList) {
            if (max.length() > s.length())
                max = s;
        }

        for (int i = 0; i < 10; i++) {
            if (min.equals(arrayList.get(i))) {
                System.out.println(min);
                break;
            } else if (max.equals(arrayList.get(i))) {
                System.out.println(max);
                break;
            }
        }
    }
}
