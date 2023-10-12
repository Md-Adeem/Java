package com.company;

public class CWH_27_arrays {
    public static void main(String[] args) {
        // int[] marks = {98,76,54,34,10,23};
        // float [] marks = {9.8f,7.6f,5.4f,3.4f,10.8f,2.3f};
//        String [] marks = {"Harry","Rohan","Saurabh","Adeem"};
//
//        System.out.println(marks[2]);
//        System.out.println(marks.length);

//        int [ ] marks = {98,78,68,54,90};
        // Displaying the Array (Naive way)
//        System.out.println("Printing using Naive method");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        // Displaying the Array (for loop)
//        System.out.println("Printing using for loop");
//        for (int i = 0;i<marks.length;i++){
//            System.out.println(marks[i]);

        //Quick Quiz:Displaying the Array in reverse order (for loop)
//        System.out.println("Printing using for loop in reverse order");
//        int[] marks = {21, 53, 67, 68, 45};
//        for (int i = marks.length - 1; i >= 0; i--) {
//            System.out.println(marks[i]);
//        }

        //Displaying the Array (for each loop)
        System.out.println("Printing using for-each loop");
        int[]marks = {11,43,54,76,98};
        for(int element:marks){
            System.out.println(element);
        }

    }
}
