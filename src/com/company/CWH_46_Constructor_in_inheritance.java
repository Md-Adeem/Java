package com.company;

class Base1{
   public int x;

    Base1(){
        System.out.println("I am a constructor");
     }
    Base1(int x){
        System.out.println("I am a overloaded Constuctor with value of x as:"+ x);
    }

    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
}
class Derived1 extends Base1{
    Derived1(){
       // super(8);
        System.out.println("I am a derived class  constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am a overloaded constructor of Derived with value of Y as:" +y);
    }
   public int y ;
    public void setY(int y ){
        this.y = y;
    }
    public int getY(){
        return y;
    }

}
class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a child of derived constuctor");
    }
   childOfDerived(int x,int y,int z){
       // super(x,y);
       System.out.println("I am a overloaded constructor of derived with value of z as:" + z);
   }
}
public class CWH_46_Constructor_in_inheritance {
    public static void main(String []args){
       // Base1 b = new Base1();
       // Derived1 d = new Derived1();
        Derived1 d = new Derived1(4,5);
       // childOfDerived d= new childOfDerived();
       // childOfDerived d = new childOfDerived(4,5,7);
    }
}
