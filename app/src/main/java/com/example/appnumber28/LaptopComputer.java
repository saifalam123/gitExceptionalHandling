package com.example.appnumber28;

public class LaptopComputer extends Computer {

    private String toucpad;
    private Double cpuPower;
    private Double ram;
    private String mouse;

    public LaptopComputer(String name , String screen , String keyboard , String mouse ,  String toucpad , Double cpuPower , Double ram){

        super(name , screen , keyboard);
        this.toucpad = toucpad;
        this.cpuPower = cpuPower;
        this.ram = ram;
        this.mouse = mouse;

    }

    public String getToucpad() {
        return toucpad;
    }

    public void setToucpad(String toucpad) {
        this.toucpad = toucpad;
    }

    public Double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(Double cpuPower) {
        this.cpuPower = cpuPower;
    }

    public Double getRam() {
        return ram;
    }

    public void setRam(Double ram) {
        this.ram = ram;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public double evalutePerformance() {
        return cpuPower * ram;

    }

    @Override
    public String toString() {
        return String.format("%s%n %s: %s %s: %s" , super.toString() , "Touch Pad" , getToucpad() , "Mouse " , getMouse());
    }
}
