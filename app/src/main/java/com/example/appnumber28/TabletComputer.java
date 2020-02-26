package com.example.appnumber28;

public class TabletComputer extends SmartPhone {

    private int screenSize;
    public TabletComputer(String name , String screen , String keyboard , String operatingSystem , Double cpuPower , Double ram , int screenSize){
        super(name , screen , keyboard , operatingSystem , cpuPower , ram);
        if (screenSize <= 0)
        {
            throw new IllegalArgumentException("ScreenSize Must be Greater than Zero");
        }
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %d" , super.toString(), "Screen Size" , getScreenSize());
    }
}
