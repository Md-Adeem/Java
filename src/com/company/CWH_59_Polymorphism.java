package com.company;

interface MyCamera2{
    void takesnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k");
    }
}
interface MyWifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+ phoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting... ");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2,MyWifi2{

    public void takesnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Taking Video");
    }
    //    public void record4kVideo(){
//        System.out.println("Record 4k video");
//    }
    public String[] getNetwork(){
        System.out.println("Getting List of Networks");
        String[] netWorkList = {"Harry","Prashanth","Anjali5G"};
        return netWorkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
    public void SampleMeth(){
        System.out.println("Meth");
    }
}
public class CWH_59_Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 =new MySmartPhone2();//This is a SmartPhone but use it as a camera
        // cam1.getNetworks(); -- > not allowed
        // cam1.SampleMeth();  // -- > Not Allowed
        cam1.takesnap();
        cam1.record4kVideo();

       MySmartPhone2 S= new MySmartPhone2();
       S.takesnap();
       S.SampleMeth();
       S.getNetwork();
       S.callNumber(8676);
       S.recordVideo();
       S.record4kVideo();


    }
}
