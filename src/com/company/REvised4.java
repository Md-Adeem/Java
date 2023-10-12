package com.company;

import java.util.Scanner;

class max1{
    int n1;
    int n2;

}

public class REvised4 {
    public int  max(int a,int b) {
        if (a>b) {
            System.out.printf("%d is greater than %d",a,b);
        }
        else if (b>a){
            System.out.printf("%d is greater than %d",b,a);
        }
        else{
            System.out.println("and are equal:");
        }

        System.out.println();
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        max1 obj = new max1();
        obj.n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        obj.n2 =sc.nextInt();

        REvised4 max1=new REvised4();
        System.out.println(max1.max(obj.n1, obj.n2));



    }
}
