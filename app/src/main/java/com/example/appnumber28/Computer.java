package com.example.appnumber28;

public abstract class Computer {

    //Hum ne computer class ko abstract class banaya hai iska koi object nahi banega jo kay main class main call ho sake.
    // Abstract class can be extented to another class, or you can say that it can be parent of another class

    private final String name;
    private final String screen;
    private final String keyboard;

    public Computer(String name , String screen , String keyboard){

        this.name = name;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getName() {
        return name;
    }

    public String getScreen() {
        return screen;
    }

    public String getKeyboard() {
        return keyboard;
    }


    @Override
    public String toString() {

        return String.format("%s%n %s%n %s " ,getName() , getScreen() , getKeyboard());
    }
    public abstract double evalutePerformance(); // Abstract method doesn't have the method body, its body is declare inside the other class!

    //Abstract Class do not have any object to be created!
}
