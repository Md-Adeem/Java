package com.company;

import java.util.concurrent.Callable;

class Cylinder{
     private int radius;
    private int height;

    public Cylinder(int radius,int height){
        this.radius =radius;
        this.height = height;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
       this.radius = radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height =height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*3.14*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Rectangle{
     private int lenght;
     private int breadth;

    public Rectangle() {
        this.lenght =4;
        this.breadth = 5;
    }

    public Rectangle(int lenght , int breadth){
         this.lenght = lenght;
         this.breadth = breadth;
     }

    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }
}
class Sphere{
    private int radius;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double volume(){
        return (4*Math.PI*radius*radius*radius)/3;
    }
    public double surfacearea(){
        return 4*Math.PI*radius*radius;
    }

}

public class CWH_44_practice_set {
    public static void main(String[] args) {
        /*
        //Problem1
        Cylinder cy = new Cylinder();
        cy.setRadius(12);
        cy.setHeight(4);
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());
        */
         //Problem2
        /*
        Cylinder cy = new Cylinder();
        cy.setRadius(12);
        System.out.println(cy.getRadius());
        cy.setHeight(4);
        System.out.println(cy.getHeight());
        System.out.println(cy.surfaceArea());
        System.out.println(cy.volume());

         */
        //Problem3
        /*
        Cylinder cy = new Cylinder(9,12);
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());
        */

        //Problem4
        /*
        Rectangle r = new Rectangle();
        System.out.println(r.getBreadth());
        System.out.println(r.getLenght());
         */

         Sphere sp = new Sphere();
         sp.setRadius(2);
        System.out.println(sp.getRadius());
        System.out.println(sp.volume());
        System.out.println(sp.surfacearea());


            }
    }

