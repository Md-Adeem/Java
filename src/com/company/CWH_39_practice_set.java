package com.company;
class Employee1 {
    int Salary;
    String name;

    public int getSalary(){

        return Salary;
    }
    public String getName(){

        return name;
    }
    public void setName(String n){

        name = n;
    }
}

class Cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void Calling(){
        System.out.println("Calling...");
    }
}
class Square{
    int side;
    public double area(){

        return side*side;
    }
    public double perimeter() {
        return 4*side;
    }
}
class rectangle{
    int length;
    int breath;
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
}
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the Enemy");
    }
    public void run(){
        System.out.println("Running from the Enemy");
    }
    public void fir(){
        System.out.println("Firing on  the Enemy");
    }
}
class circle{
    int radius;
    public double area(){
        return  Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class Trianle {
    int l;
    int b;
    int h;
    public int area(){
        return (b*h)/2;

    }
    public int perimeter(){
        return l+b+h;
    }
}
public class CWH_39_practice_set {
    public static void main(String[] args) {
        /*
        // problem 1
        Employee1 harry = new Employee1();
        harry.setName("code with Harry");
        harry.Salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        //Problem 2
        Cellphone redmi = new Cellphone();  //Instantiating a cellphone object
        redmi.Calling();
        redmi.ringing();
        redmi.vibrating();
        */
        // Problem 3

        Square sq = new Square();
        sq.side = 9;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


        // Problem 4
        /*
        rectangle rc = new rectangle();
        rc.length = 5;
        rc.breath = 4;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());
         */

        // Problem 5
        /*
        TommyVecetti TV = new TommyVecetti();
        TV.fir();
        TV.hit();
        TV.run();
        */

        // Problem 6
   /*
        circle ce = new circle();
        ce.radius = 3;
        System.out.println(ce.area());
        System.out.println(ce.perimeter());
*/


        // problem 7
        /*
        Trianle Te = new Trianle();
        Te.b = 4;
        Te.l = 3;
        Te.h = 5;
        System.out.println(Te.area());
        System.out.println(Te.perimeter());

         */
    }
}
