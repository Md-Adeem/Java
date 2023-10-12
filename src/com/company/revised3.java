package com.company;

import java.util.Scanner;

class Employee7{
      public String name;
      public int Year_Of_Joining;
     public int Salary;
     public String Address;

    public void Detail(){
        System.out.println("My name is:" + name);
        System.out.println("Year of joining is:" + Year_Of_Joining);
        System.out.println("My salary is:" + Salary);
        System.out.println("My Address is:" + Address);
    }

}
public class revised3 {
    public static void main(String[] args) {
        Employee7 emp = new Employee7();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name:");
        emp.name = sc.nextLine();

        System.out.println("Enter your Year of Joining is:");
        emp.Year_Of_Joining = sc.nextInt();

        System.out.println("Enter your Salary:");
        emp.Salary = sc.nextInt();
        sc.nextLine();


        System.out.println("Enter your Address:");
        emp.Address = sc.nextLine();


        System.out.println();
        emp.Detail();

    }
}
