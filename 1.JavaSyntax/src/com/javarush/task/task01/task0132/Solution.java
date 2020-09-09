package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String str = String.valueOf(number);
        char[] strToArray = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < strToArray.length; i++) {
            sum = sum + (strToArray[i] - '0');

        }
        return sum;
    }
}