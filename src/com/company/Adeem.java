package com.company;

import java.util.*;

public class Adeem {
    int side;
    double Radius;
    int l,b,h;

    public int Volume(int side){
        return side*side*side;
    }
    public int Volume(int l,int b,int h){
        return l*b*h;
    }
    public double Volume(double radius){
        return (4*Math.PI*radius*radius*radius)/3 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adeem obj = new Adeem();
        System.out.println("Enter the side of a cube:");
        obj.side = sc.nextInt();
        System.out.println("The volume of cube is " +obj.Volume(obj.side));
        System.out.println();

        System.out.println("Enter the length,breadth,height of a cuboid:");
        System.out.print("Length is:");
        obj.l = sc.nextInt();
        System.out.print("Breadth is:");
        obj.b = sc.nextInt();
        System.out.print("Height is:");
        obj.h = sc.nextInt();
        System.out.println("The volume of cuboid is " + obj.Volume(obj.l,obj.b,obj.h));
        System.out.println();

        System.out.println("Enter the radius of a Sphere:");
        obj.Radius = sc.nextInt();
        System.out.println("The volume of Sphere is "+ obj.Volume(obj.Radius));

    }
}
