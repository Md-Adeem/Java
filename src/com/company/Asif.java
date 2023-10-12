package com.company;
public class Asif{
    int height;
    int base;
    int hypo;
    Asif(){
        height = 3;
        base = 4;
        hypo  = 4;
    }
    // void display(){
    //   System.out.println("height"+height);
    // System.out.println("base"+base);
    //System.out.println("hypo"+hypo);
    //}
//Void calculate()
    //  public static void main(String[] args) {
    //    Triangle2 tri = new Triangle2();
    //  tri.display();
    public static void main(String[] args) {
        Asif tri = new Asif();
        System.out.println("The height is " + tri.height);
        System.out.println("the base is " + tri.base);
        System.out.println("the hypo is " + tri.hypo);
        System.out.println("The area of triangle is:"+tri.area(tri.base, tri.height));
        System.out.println("the perimeter of triangle is:"+tri.perimeter(tri.height,tri.base,tri.hypo));
    }
    public int area(int base,int height){
        return (base*height)/2;
    }
    public int perimeter(int base,int height,int hypo){
        return base+height+hypo;

}
}

