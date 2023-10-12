package com.company;

import java.util.Scanner;

public class Triangle1 {
    int l =3;
    int b= 4;
    int h=5;

    public int perimeter(int l,int b,int h){
        return l*b*h;
    }
    public int area(int b,int h){
        return (b*h)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle1 tri = new Triangle1();
        System.out.println("Enter the length:");
        tri.l = sc.nextInt();
        System.out.println("Enter the breadth:");
        tri.b = sc.nextInt();
        System.out.println("Enter the height:");
        tri.h = sc.nextInt();
        System.out.println("The perimeter of triangle is "+tri.perimeter(tri.l,tri.b,tri.h));
        System.out.println("The area of triangle is "+ tri.area(tri.b,tri.h));
    }
}
