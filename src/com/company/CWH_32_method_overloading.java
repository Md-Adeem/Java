package com.company;

public class CWH_32_method_overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a +" bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good mornig "+ a + " bro!");
        System.out.println("Good mornig " + b +" bro!");
    }
    static void change(int a ){
        a =98;
    }
    static void change2(int [] arr){

        arr[0] = 98;
    }
    static void telljoke(){
        System.out.println("I invented a new world!\n" +  " Plagiarism!");
    }

    public static void main(String[] args) {
       // telljoke();
//        int [] marks ={52,73,87,98,67,93};
//        //case1 :changing the Integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is:" + x);

        // case2 :changing the array
//        int [] marks ={52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("The value of x after running change is:" + marks[0]);

        // Method overloading
        foo();
        foo(300);
        foo(300,400);
        //Arguments are actual!

    }
}
