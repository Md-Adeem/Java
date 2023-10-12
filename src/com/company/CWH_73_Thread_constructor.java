package com.company;

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
        System.out.println("Thank you"+getName());
//        while (true) {
//            System.out.println("I am a Thread");
//
//        }
    }
}
public class CWH_73_Thread_constructor {
    public static void main(String[] args) {
        MyThr t1= new MyThr("harry");
        MyThr t2= new MyThr("Ramesh");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The id of the thread t2 is "+ t2.getId());
    }
}
