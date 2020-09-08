package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(87, 1.12));
        System.out.println(convertEurToUsd(93, 0.99));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return (eur*exchangeRate);
    }
}
