package com.company;
import java.util.*;
import java.util.Scanner;

public class AutomorphicNumber{
    public static void main(String[] args) {
        int n,sq,copy,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        sq=n*n;
        copy=n;
        while(copy>0){
            c++;
            copy=copy%10;
        }
        int end = sq%(int) Math.pow(10,c);
        if(n ==end){
            System.out.println("It is Automorphic");
        }
        else {
            System.out.println("It is not automorphic");
        }
    }
}
