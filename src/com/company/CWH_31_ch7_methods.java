package com.company;

public class CWH_31_ch7_methods {
//    static int logic(int x ,int y ){
//        int z;
//        if (x>y){
//            z = x+y;
//        }
//        else {
//            z =(x+y) * 5;
//        }
//        return z;
//    }
//    public static void main(String[] args) {
//        int a= 5;
//        int b = 7;
//        int c;
//        c = logic(a,b);
//
//        int a1 = 2;
//        int b1 = 1;
//        int c1;
//        c1 = logic(a1,b1);
//        System.out.println(c);
//        System.out.println(c1);


        static int mysum (int a,int b){
            int c = a+b;
            return c;
        }
        public static void main(String[]args){
            int x = 2;
            int y = 4;
            int z ;
           // CWH_31_ch7_methods obj = new CWH_31_ch7_methods();
          //  z =  obj .mysum(x,y);
            z = mysum(x,y);
            System.out.println(z);

            int x1 = 5;
            int y1 = 7;
            int z1;
           // z1 =  obj.mysum(x1,y1);
            z1 = mysum(x1,y1);
            System.out.println(z1);

        }
    }
