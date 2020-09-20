package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
        String name;
        int age;
        int weight;
        String address;
        String color;

    public Cat(String name) {//Имя
        this.name = name;
        this.age = 5;
        this.weight = 8;
        this.color = "GREY";
    }

    public Cat(String name, int weight, int age) {//Имя, вес, возраст
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "GREY";
    }

    public Cat(String name, int age) {//Имя, возраст (вес стандартный)
        this.name = name;
        this.age = age;
        this.weight = 8;
    }

    public Cat(int weight, String color) {//вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
        this.age = 5;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {//вес, цвет, адрес (чужой домашний кот)
        this.age = 5;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
