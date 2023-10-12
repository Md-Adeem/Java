package com.company;

class Employee{
    int id;
    int Salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);

    }
     public int  getsalary(){
        return Salary;
     }

    }


public class CWH_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); //Instantiating a new Employee object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.Salary = 34;
        harry.name = "code with Harry";

        // Setting Attributes for john
        john.id = 15;
        john.Salary = 12;
        john.name = "john khan";

        // Printing Attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getsalary();
        System.out.println(salary);
        /// System.out.println(harry.id);
        //System.out.println(harry.name);

    }
}
