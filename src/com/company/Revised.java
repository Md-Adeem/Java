package com.company;
import javax.management.AttributeValueExp;
import java.util.Scanner;

class Student{
    String name;
    int roll_no;
}
class Average{
   public  float x,y,z;

public double  average(){
    return (x+y+z)/3;
}
}


class employee8{
    private int id;
    private String name;

    public employee8(){
        id = 22;
        name = "code with harry";
    }
    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
}


public class Revised {
    /*public static float Average(float x,float y,float z){
        float av = (x+y+z)/3;
         return av;
    } */
    public static void main(String args[]) {
        /*
        // Problem1
        Student boy = new Student();
        boy.name ="JOHN";
        boy.roll_no = 34;
        System.out.println("My Name is " + boy.name +" and my roll no. is " +boy.roll_no);

         */
        //Problem2
/*
        Average av = new Average();
        System.out.println("Enter x,y,z");
        Scanner sc = new Scanner(System.in);
         av.x = sc.nextFloat();
         av.y = sc.nextFloat();
         av.z = sc.nextFloat();

        System.out.println(av.average());


 */

    /*
        System.out.println("Enter x,y,z");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextInt();
        float y = sc.nextInt();
        float z = sc.nextInt();

        float avg = Average(x,y,z);  // function call
        System.out.println(avg);


     */


        //employee8 emp = new employee8();
        //System.out.println(emp.getName());
        //emp.getName();
        //emp.getId();
    }
}
