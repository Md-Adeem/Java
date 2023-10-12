package com.company;
import java.util.Scanner;

public class CWH_23_ch5_for_loop {
    public static void main(String[] args) {
//        for(int i = 1; i<=10; i++ ) {
//            System.out.println(i);
//        }

     //   WAP to print first n odd number using a for loop.
        // 2i = Even Numbers = 0,2,4,6,8
        // 2i+1 = 1,3,5,7 = odd numbers
//         int n = 10;
//         for(int i = 0; i < n; i++){
//             System.out.println(2*i+1);
//         }
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();


        for( int i =n; i>=0; i--) {
            System.out.println(i);
        }


    }
}
