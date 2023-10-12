package com.company;

public class CWH_26_Array {
    public static void main(String[] args) {
        /* Classroom of 500 student - you have to store marks of these 500 students
        you have 2 option:
        1.Create 500 variables
        2.Use Arrays (recommended)
         */
         //There are three main way to create an array in java
         // 1.Declaration and memory allocation
        // int [] marks = new int [5];

          //2.declaration and then  memory allocation

//          int [] marks;               //Declaration
//          marks = new int [5];       // Memory Allocation
//          marks[0] = 100;
//          marks[1] = 60;
//          marks[2] = 70;
//          marks[3] = 98;
//          marks[4] = 86;
//          marks[4] = 96;
//          // marks[5] = 87; Throw an error
//          System.out.println(marks[3]);

         //3.Declaration,memory allocation and initialization together..
         int [] marks = {98,67,80,56,90};
        System.out.println(marks[4]);


    }
}
