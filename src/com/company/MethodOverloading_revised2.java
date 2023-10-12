package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodOverloading_revised2 {

public void AreaAndPerimeter(int side){
    System.out.println("The area of Square is: "+(side*side));
    System.out.println("The Perimeter of Square is: " +(4*side));
}
public void AreaAndPerimeter(int l,int b){
    System.out.println("The area of rectangle is: "+(l*b));
    System.out.println("The perimeter of rectangle is: "+(2*(l+b)));
}
public void AreaAndPerimeter(int a,int base ,int h){
    System.out.println("The area of triangle is: "+ (base*h)/2);
    System.out.println("The perimeter of triangle is: "+(a+base+h));
}
public void AreaAndPerimeter(double r){
    System.out.println("The area of circle is: "+ Math.PI*r*r);
    System.out.println("The perimeter of circle is: " + 2*Math.PI*r);
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MethodOverloading_revised2 obj = new MethodOverloading_revised2();
        System.out.print("Enter the side:");
        int side = sc.nextInt();
        obj.AreaAndPerimeter(side);

        System.out.print("Enter the length:");
        int l = sc.nextInt();
        System.out.print("Enter the breadth:");
        int b = sc.nextInt();
        obj.AreaAndPerimeter(l,b);

        System.out.print("Enter the side for triangle:");
        int a = sc.nextInt();
        System.out.print("Enter the base:");
        int base = sc.nextInt();
        System.out.print("Enter the height:");
        int h = sc.nextInt();
        obj.AreaAndPerimeter(a,base,h);

        System.out.print("Enter the radius:");
        double r = sc.nextDouble();
        obj.AreaAndPerimeter(r);


    }
}
