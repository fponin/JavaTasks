package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top, left, width, height;
     public void initialize(int top, int left, int width,int height){
         this.top = top;
         this.left = left;
         this.width = width;
         this.height = height;
     }
     public void initialize (int top, int left){
         this.top = top;
         this.left = left;
         this.height = 0;
         this.width = 0;
     }
     public void initialize (int top, int left, int width){
         this.top = top;
         this.left = left;
         this.width = width;
         this.height = this.width;
     }

    public void initialize(Rectangle rectangle) {
        rectangle.top = top;
        rectangle.left = left;
        rectangle.width = width;
        rectangle.height = this.width;
    }

    public static void main(String[] args) {

    }
}
