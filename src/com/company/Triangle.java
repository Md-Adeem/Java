package com.company;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int l;
        int b;
        int h;
        Scanner sc = new Scanner(System.in);
        Triangle tri = new Triangle();
        System.out.println("Enter the length");
        l=sc.nextInt();
        System.out.println("Enter the base");
        b= sc.nextInt();
        System.out.println("Enter the height");
        h =sc.nextInt();

        System.out.println("The area of triangle is"+tri.area(b,h));
        System.out.println("The perimeter of triangle is" +tri.perimeter(l,b,h));

    }
    public int area(int b,int h){
        return  (b*h)/2;
    }
    public int perimeter(int l,int b,int h){
        return  l*b*h;
    }
}
