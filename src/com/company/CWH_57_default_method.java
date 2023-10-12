package com.company;

interface MyCamera{
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
interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
    }
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+ phoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting... ");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{

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
}
public class CWH_57_default_method {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        String[] ar = ms.getNetwork();
        for (String item:ar) {
            System.out.println(item);

        }
    }
}
