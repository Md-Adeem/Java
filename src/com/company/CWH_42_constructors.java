package com.company;

class MymainEmployee{
    private int id;
    private String name;

    public MymainEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }
     public MymainEmployee(String myname,int myId){
         id = myId;
         name = myname;
     }
     public MymainEmployee(String myname){
        id = 1;
        name = myname;
     }
    public void setname(String n) {
         name = n;
    }
    public String getname(){

        return  name;
    }
    public void setId(int i){

        id = i;
    }
    public int getId(){
        return id;
    }
}

public class CWH_42_constructors {
    public static void main(String[] args) {
       // MymainEmployee harry = new MymainEmployee("Programmimg with Harry",34);
        MymainEmployee harry = new MymainEmployee("code with Harry");
        //harry.setname("code with harry");
        //harry.setId(23);

        System.out.println(harry.getId());
        System.out.println(harry.getname());

    }
}
