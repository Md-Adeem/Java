package com.company;

class phone{

    public void ShowTime(){
        System.out.println("Time is 8 am");
    }
    public void On(){
        System.out.println("Turning on phone");
    }
}
class Smartphone extends phone {
    public void Music(){
        System.out.println("playing music" );
    }
    public void On(){
        System.out.println("Turning on Smartphone");
    }
}

public class CWH_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj = new Smartphone();//Yes it is allowed
        //Smartphone obj2 = new phone(); //Not Allowed
        obj.ShowTime();
        obj.On();
       // obj.music(); // Not allowed

    }
}
