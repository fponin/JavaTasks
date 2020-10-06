package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human chid1 = new Human("Anna", false, 20);
        System.out.println(chid1);
        Human chid2 = new Human("Joe", true, 16);
        System.out.println(chid2);
        Human chid3 = new Human("Kate", false, 8);
        System.out.println(chid3);

        Human father = new Human("Fedor", true, 36, new ArrayList<Human>(Arrays.asList(chid1, chid2, chid3)));
        System.out.println(father);
        Human mother = new Human("Irina", false, 35, new ArrayList<Human>(Arrays.asList(chid1, chid2, chid3)));
        System.out.println(mother);

        Human grFather1 = new Human("Nik", true, 66, new ArrayList<Human>(Arrays.asList(father)));
        System.out.println(grFather1);
        Human grFather2 = new Human("Pavel", true, 66, new ArrayList<Human>(Arrays.asList(mother)));
        System.out.println(grFather2);
        Human grMother1 = new Human("Valy", false, 66, new ArrayList<Human>(Arrays.asList(father)));
        System.out.println(grMother1);
        Human grMother2 = new Human("Zina", false, 66, new ArrayList<Human>(Arrays.asList(mother)));
        System.out.println(grMother2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
