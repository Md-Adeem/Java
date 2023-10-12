package com.company;
import java.util.Scanner;

public class CWH_19_ch4_ps {
    public static void main(String[] args) {
//        //Q1:
////         int a = 11;
////         if(a = 10);
////
////
//        //Q2:
//
////        Byte m1,m2,m3;
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter your marks in physics");
////        m1 = sc.nextByte();
////
////        System.out.println("Enter your marks in chemistry");
////        m2 = sc.nextByte();
////
////        System.out.println("Enter your marks in mathematics");
////        m3 = sc.nextByte();
////        float avg = (m1+m2+m3)/3.0f;
////        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
////            System.out.println("Congratulation, you have been promoted");
////        }
////        else{
////            System.out.println("Sorry,you have not been promoted! Please try again.");
////        }
//
//         //Q3:
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter your Income in Lakhs per annum");
////        float tax = 0;
////        float income = sc.nextFloat();
////        if(income<2.5){
////            tax = tax + 0;
////        }
////         else if (income>2.5f && income < 5f){
////            tax = tax + 0.05f * (income - 2.5f);
////        }
////        else if (income>5f && income < 10f){
////            tax = tax + 0.05f * (5.0f - 2.5f);
////            tax = tax + 0.2f * (income - 5f);
////        }
////        else if (income>10.0f){
////            tax = tax + 0.05f * (5.0f-2.5f);
////            tax = tax + 0.2f * (10.0f - 5f);
////            tax = tax + 0.3f * (income - 10.0f);
////        }
////        System.out.println("The total tax paid by the employee is: " + tax )
//
//        //Q4:
//
//         Scanner sc = new Scanner (System.in);
//          int day = sc.nextInt();
//
//          switch (day){
//              case 1 -> System.out.println("Monday");
//              case 2 -> System.out.println("Tuesday");
//              case 3 -> System.out.println("Wednesday");
//              case 4 -> System.out.println("Thursday");
//              case 5 -> System.out.println("Friday");
//              case 6 -> System.out.println("Saturday");
//              case 7 -> System.out.println("Sunday");
//          }

      //  Q5:
        System.out.print("Enter an year :");
        Scanner sc = new Scanner (System.in);
         int year = sc.nextInt();


        if(((year % 4 ==0) && (year % 100!= 0)) || (year % 400 == 0)){
            System.out.println("specified year is a leap year");}
         else {
            System.out.println("specified year is not a leap year");
        }





        //Q6:

//         Scanner sc = new Scanner (System.in);
//         String website = sc.next();
//         if(website.endsWith(".org")){
//             System.out.println("This is an organizational website");
//         }
//         else if(website.endsWith(".com")){
//             System.out.println("This is an Commercial website");
//         }
//         else if (website.endsWith(".in")){
//             System.out.println("This is an Indian website");
//         }

    }
}