package com.company;

import java.util.Scanner;

public class Employee9{
    String name;
    int Year_of_Joining;
    int Salary;
    String Address;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee9 emp = new Employee9();

        System.out.println("Enter the first employee name: ");
        emp.name = sc.nextLine();

        System.out.println("Enter the first employee year of joining: ");
        emp.Year_of_Joining = sc.nextInt();

        System.out.println("Enter the first employee Salary: ");
        emp.Salary = sc.nextInt();
        emp.Address = sc.nextLine();

        System.out.println("Enter the first employee  Address: ");
        emp.Address = sc.nextLine();

        System.out.println();
        Detail(emp.name, emp.Year_of_Joining, emp.Salary, emp.Address);

        Employee9 emp1 = new Employee9();
        System.out.println("Enter the second employee name: ");
        emp1.name = sc.nextLine();

        System.out.println("Enter the second employee year of joining: ");
        emp1.Year_of_Joining = sc.nextInt();

        System.out.println("Enter the second employee Salary: ");
        emp1.Salary = sc.nextInt();
        emp1.Address = sc.nextLine();

        System.out.println("Enter the second employee Address: ");
        emp1.Address = sc.nextLine();

        System.out.println();
        Detail(emp1.name, emp1.Year_of_Joining, emp1.Salary, emp1.Address);

        Employee9 emp3 = new Employee9();
        System.out.println("Enter the third employee name: ");
        emp3.name = sc.nextLine();

        System.out.println("Enter the third employee year of joining: ");
        emp3.Year_of_Joining = sc.nextInt();

        System.out.println("Enter the third employee Salary: ");
        emp3.Salary = sc.nextInt();
        emp3.Address = sc.nextLine();

        System.out.println("Enter the third employee Address: ");
        emp3.Address = sc.nextLine();

        System.out.println();
        Detail(emp3.name, emp3.Year_of_Joining, emp3.Salary, emp3.Address);


    }
    public static void Detail(String name,int year_of_Joining,int salary,String address){
        System.out.println("My Name is: " +name);
        System.out.println("My year of joining is: " +year_of_Joining);
        System.out.println("My Salary is: " +salary);
        System.out.println("My Address is: " +address);

    }
    }
