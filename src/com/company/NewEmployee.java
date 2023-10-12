package com.company;

import java.util.Scanner;

public class NewEmployee {
    String name;
    int Year_Of_Joining;
    int Salary;
    String Address;

    public void Detail(){
        System.out.println("My name is:" + name);
        System.out.println("Year of joining is:" + Year_Of_Joining);
        System.out.println("My salary is:" + Salary);
        System.out.println("My Address is:" + Address);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        NewEmployee emp = new NewEmployee();


        System.out.println("Enter your Name:");
        emp.name = sc.nextLine();

        System.out.println("Enter your Year of Joining is:");
        emp.Year_Of_Joining = sc.nextInt();

        System.out.println("Enter your Salary:");
        emp.Salary = sc.nextInt();
        emp.Address = sc.nextLine();


        System.out.println("Enter your Address:");
        emp.Address = sc.nextLine();


        System.out.println();
        emp.Detail();

    }
}
