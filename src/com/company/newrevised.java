package com.company;

class Employee6 {
    private int id;
    private String name;

    public Employee6(){
        id = 22;
        name = "code with harry";
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

}
public class newrevised {
    public static void main(String args[]){
        Employee6 emp = new Employee6();
        System.out.println(emp.getName());
        //emp.getName();
        System.out.println(emp.getId());
    }
}
