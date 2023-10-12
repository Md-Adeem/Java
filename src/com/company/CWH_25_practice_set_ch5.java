package com.company;
import java.util.Scanner;

public class CWH_25_practice_set_ch5 {
    public static void main(String[] args) {
        //Q1:
//        int n = 4;
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.print("\n");
//
//        }


        //Q2:

//         int sum = 0;
//         int n =5;
//         for( int i=0;i<n;i++){
//             sum = sum +(2*i);
//         }
//        System.out.println("Sum of even numbers is:");
//        System.out.println(sum);
        // First 5 even numbers are: 0,2,4,6,8


        //Q3:

//        int n = 5;
//        for(int i = 1; i<=10; i++) {
//            System.out.printf("%d X %d = %d \n", n, i, n * i);
//        }


        //Q4:
//        int n =10;
//        for(int i =10; i>=1;i--){
//            System.out.printf("%d X %d = %d \n",n,i,n*i);
//        }

        //Q6:
//        int n =5;
//        // what is factorial n = n * n-1 * n-2 .... 1
//        // 5! = 5*4*3*2*1
//        int i = 1;
//        int factorial = 1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.printf("%d X %d = %d ", n,i,factorial);

        //Q9:

//        int n = 5;
//        int sum =0;
//
//        for(int i =1;i<=10;i++){
//            sum += n*i;
//        }
//        System.out.println( sum);
//

        //10:
        //Even number : 0,2,4,6,8

        System.out.print("Enter the number:");

     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();

     int sum = 0;
     for(int i =0;i<n ;i++){
         sum = sum +(2*i);
     }
        System.out.println(sum);
    }

    }
