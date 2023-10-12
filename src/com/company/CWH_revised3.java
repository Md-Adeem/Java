package com.company;

import java.util.Scanner;

class number{
    int n1;
    int n2;

public int  max() {
    if (n1 > n2) {
        System.out.println("N1 is greater than N2:");
    }
    else {
        System.out.println("N2 is greater than N1:");
    }
return 0;
}
}

public class CWH_revised3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 number:");
        number num = new number();
        num.n1 =sc.nextInt();
        num.n2 = sc.nextInt();
        System.out.println(num.max());

    }
}
