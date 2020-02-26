package com.example.appnumber28;

public class DesktopComputer extends Computer {
    private String mouse;
    private Double cpuPower;
    private Double ram;

    public DesktopComputer(String name , String screen , String keyboard , String mouse , Double cpuPower , Double ram){

        super(name , screen , keyboard);
        this.mouse = mouse;
        this.cpuPower = cpuPower;
        this.ram = ram;

    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public Double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(Double cpuPower) {
        if (cpuPower <= 0)
        {
            throw new IllegalArgumentException("Cpu power must be Greater than Zero");
        }
        this.cpuPower = cpuPower;
    }

    public Double getRam() {
        return ram;
    }

    public void setRam(Double ram) {
        if (ram <= 0 )
        {
            throw new IllegalArgumentException("Ram must be greater than Zero");
        }
        this.ram = ram;
    }

    // This the abstract method which is present in super class (Computer) and Its is here going to be performed by making its own body
    @Override
    public double evalutePerformance() {
        return cpuPower * ram;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %f%n%s %f" , super.toString() , "CPU power" , getCpuPower() , "RAM" , getRam());
    }

}
