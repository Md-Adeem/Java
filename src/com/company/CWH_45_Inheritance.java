package com.company;

class Base{
   public int x;

    public void setX(int x){
        System.out.println("I am in Base and Setting X now");
        this.x = x;
    }
    public int getX(){
        return x;
    }
    //public void printMe(){
      //  System.out.println("I am a constructor");
    }

//}
class Derived extends Base{
    public int y;

    public void setY(int y){
        System.out.println("I am in Derived and setting Y now");
        this.y= y;
    }
    public int getY(){
        return y;
    }
}
public class CWH_45_Inheritance {
    public static void main(String args[]){
        Base b = new Base();
        b.setX(3);
        System.out.println(b.getX());
        Derived d = new Derived();
        d.setX(34);
        System.out.println(d.getX());
    }
}
