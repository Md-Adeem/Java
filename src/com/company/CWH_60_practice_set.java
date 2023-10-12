package com.company;

abstract class Pen {
    abstract void Write();

    abstract void Refill();
}
class FountainPen extends Pen{
    void Write(){
        System.out.println("Write");
    }
    void Refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}
class Monkey{
    public void Jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}
class Human extends Monkey{

}
public class CWH_60_practice_set {
    public static void main(String[] args) {
        Pen pen = new FountainPen();
        pen.Write();
        pen.Refill();

    }
}
