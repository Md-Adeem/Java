package com.company;


import org.w3c.dom.xpath.XPathNamespace;

class  Employee5{
    private   String  name;
    private   int year_of_joining;
    private   int salary;
    private String  address;

    public Employee5(String n ,int join,int s,String add){
        name = n;
        year_of_joining = join;
        salary = s;
        address = add;
    }
   public String getName(){
        return  name;
    }
    public int  getYear_of_joining(){
        return  year_of_joining;
    }
    public int getSalary(){
        return salary;
    }
    public String getAddress(){
        return address;
    }


}
public class hello {
    public static void main(String[] args) {
        Employee5 harry =new Employee5("harry",2012,20000,"Patna");
        Employee5 john = new Employee5("John",2015,30000,"lucknow");
        Employee5 adeem = new Employee5("Adeem",2010,120000,"Aligarh");
        System.out.println("My name is " + harry.getName()+", i join the company in "+harry.getYear_of_joining()+" and my salary is "+harry.getSalary()+" and my address is "+harry.getAddress()+"...");
        System.out.println("My name is " + john.getName()+", i join the company in "+john.getYear_of_joining()+" and my salary is "+john.getSalary()+" and my address is "+john.getAddress()+"...");
        System.out.println("My name is " + adeem.getName()+", i join the company in "+adeem.getYear_of_joining()+" and my salary is "+adeem.getSalary()+" and my address is "+adeem.getAddress()+"...");
    }
}
