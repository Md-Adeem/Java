package com.company;

public class CWH_15_ps3 {
    public static void main(String[] args) {
        //Q1
        String name = "Adeem Alam";
        name = name.toLowerCase();
        System.out.println(name);

        //Q2
        String text = "To Lower Case";
        text = text.replace(" ","_");
        System.out.println(text);

        //Q3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter= letter.replace("<|name|>","Vikrant");
        System.out.println(letter);

        //Q4
        String myString = "This string  contains double and    triple spaces ";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("    "));

        //Q5
        String myLetter = "Dear Harry,\n\t This Java Course is Nice.\n Thanks";
        System.out.println(myLetter);


    }
}
