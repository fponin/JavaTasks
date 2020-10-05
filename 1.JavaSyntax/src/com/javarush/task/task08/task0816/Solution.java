package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("JANUARY 1 2012"));
        map.put("Иванов", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Сидоров", dateFormat.parse("MARCH 1 2012"));
        map.put("Пушкин", dateFormat.parse("APRIL 1 2012"));
        map.put("Лермонтов", dateFormat.parse("MAY 1 2012"));
        map.put("Достоевский", dateFormat.parse("JULY 1 2012"));
        map.put("Петров", dateFormat.parse("JUNE 1 2012"));
        map.put("Кузнецов", dateFormat.parse("AUGUST 1 2012"));
        map.put("Кузькин", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Чехов", dateFormat.parse("NOVEMBER 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        Map<String, Date> mapCopy = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : mapCopy.entrySet()) {
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
                map.remove(pair.getKey());
            }
        }

    }

    public static void main(String[] args) throws ParseException {


    }
}
