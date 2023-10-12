package com.company;

interface Bicycle{
    int a = 45;
     void applyBrake(int decrement);
     void Speedup(int increment);
}
interface HornBicycle{
    void blowHorn3kg();
    void blogHorn();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }

    public  void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void Speedup(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHorn3kg(){
        System.out.println("Kabhi khushi kabhi gum pee pee");
    }
    public void blogHorn(){
        System.out.println("Main hoon Na poo poo");
    }
}

public class CWH_54_Interface {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // you can create properties in intefaces
        System.out.println(cycleHarry.a);
        // You cannot modify the properties in interface as they are final
       // cycleHarry.a = 456;
       // System.out.println(cycleHarry.a);
        cycleHarry.blowHorn3kg();
        cycleHarry.blogHorn();
    }
}
