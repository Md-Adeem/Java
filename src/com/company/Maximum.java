package com.company;

import java.util.Scanner;

public class Maximum{
    int n1;
    int n2;
    public int Max(int n1,int n2){
        if(n1>n2){
            System.out.printf("%d is greater than %d",n1,n2);
        } else if (n1<n2) {
            System.out.printf("%d is greater than %d",n2,n1);
        }
        else {
            System.out.println("%d is equal to %d");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        Maximum obj = new Maximum();
        obj.n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        obj.n2 = sc.nextInt();

        obj.Max(obj.n1,obj.n2);



    }
}
