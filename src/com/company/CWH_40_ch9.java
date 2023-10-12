package com.company;

class MyEmployee{
   private int id ;
   private String name;

   public String getname(){
       return name;
   }
   public void setname(String n){
       this.name = n;
   }
    public int getId(){
        return id;
    }
   public void setId(int i){
      this.id = i;
   }


}
public class CWH_40_ch9 {
    public static void main(String[] args) {

        MyEmployee harry = new MyEmployee();
        //harry.id = 45;
        //harry.name = "code with harry"; -- > Throws an error due to private access modifier
        harry.setname("code with harry");
        System.out.println(harry.getname());
        harry.setId(234);
        System.out.println(harry.getId());
    }
}
