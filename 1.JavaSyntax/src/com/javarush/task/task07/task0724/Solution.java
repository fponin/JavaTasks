package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFather1 = new Human("Дедушка1", true, 78);
        System.out.println(grandFather1);
        Human grandFather2 = new Human("Дедушка2", true, 75);
        System.out.println(grandFather2);
        Human grandMother1 = new Human("Бабушка2", false, 68);
        System.out.println(grandMother1);
        Human grandMother2 = new Human("Бабушка2", false, 65);
        System.out.println(grandMother2);

        Human father = new Human("Папа", true, 45, grandFather1, grandMother1);
        System.out.println(father);
        Human mother = new Human("Мама", false, 43, grandFather2, grandMother2);
        System.out.println(mother);
        Human dother = new Human("Старшая Дочка", false, 20, father, mother);
        System.out.println(dother);
        Human dother2 = new Human("Любимая Дочка", false, 5, father, mother);
        System.out.println(dother2);
        Human son = new Human("Сын", true, 15, father, mother);
        System.out.println(son);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
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

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}