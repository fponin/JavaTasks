package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int lenght = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int thisLeng = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    thisLeng++;
                } else
                    break;
            }
            if (lenght < thisLeng)
                lenght = thisLeng;
        }

        System.out.println(lenght);

    }
}