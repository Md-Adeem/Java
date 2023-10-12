package com.company;
import java.util.Scanner;

public class CWH_18_else_if {
    public static void main(String[] args) {
        String var = "Adeem";

        switch (var) {
            case "Fraz" -> {
                System.out.println("you are going to become an Adult!");
                System.out.println("you are going to become an Adult!");
                System.out.println("you are going to become an Adult!");
            }

            case "Aaquib" -> System.out.println("you are going to join a job!");
            case "Adeem" -> System.out.println("you are going to get retired!");
            default -> System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my java code!");



        /*

        int age;
        System.out.println("Enter your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age>56){
            System.out.println("You are experienced!");
        }
        else if (age>46){
            System.out.println("You are semi experienced!");
        }
        else if (age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }

         */
    }
}
