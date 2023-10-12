package com.company;

public class CWH_24_ch5_break_continue {
    public static void main(String[] args) {
        // Break and Continue using loops!
//        for(int i =0;i<50;i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }


         int i = 0;
        do {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }while(i<5);
            System.out.println("Loop ends here");





        }
    }

