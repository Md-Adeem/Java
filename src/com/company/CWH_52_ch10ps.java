package com.company;
import java.lang.Math.*;

class Circle1{
   public int radius;

    public double area(){
        return Math.PI*radius*radius;
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius =radius;
    }
}
class Cylinder1 extends Circle1{
   public int height;

    public double area(){
        return 2*Math.PI*radius*(height+radius);
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
       this.height = h;
    }
}
class Rectangle2{
   public int L;
   public int B;

   public void setL(int l){
       L = l;
   }
   public int getL(){
       return L;
   }
   public void setB(int b){
       B = b;

   }
   public int getB(){
    return B;
   }
   public int area(){
       return L*B;
   }
}
class Cuboid2 extends Rectangle2{
    public int height;

    public void setH(int h){
        height = h;
    }
    public int getH(){
        return height;
    }
    public int SurfaceAreaOfCuboid(){
        return 2*(L * B + B * height + L * height);
    }

}

public class CWH_52_ch10ps {
    public static void main(String[] args) {
        /*
        Circle1 cr=new Circle1();
        cr.setRadius(4);
        System.out.println(cr.getRadius());
        System.out.println(cr.area());

        Cylinder1 cy = new Cylinder1();
        cy.setRadius(5);
        cy.setHeight(5);
        System.out.println(cy.getHeight());
        System.out.println(cy.area());

         */
        /*
        Rectangle2 rc = new Rectangle2();
        rc.setL(3);
        rc.setB(4);
        System.out.println( "The area is:" + rc.area());


         */
        Cuboid2 cu = new Cuboid2();
        cu.setL(3);
        cu.setB(4);
        cu.setH(5);
        System.out.println(cu.SurfaceAreaOfCuboid());




    }
}
