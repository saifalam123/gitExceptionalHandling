package com.example.appnumber28;

public class SmartPhone extends Computer {

    private String operatingSystem;
    private Double cpuPower;
    private Double ram;

    public SmartPhone(String name , String screen , String keyboard , String operatingSystem , Double cpuPower , Double ram){

        super(name , screen , keyboard);



        this.cpuPower = cpuPower;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(Double cpuPower) {
        if (cpuPower <= 0){
            throw new IllegalArgumentException("Must be greater than Zero");
        }
        this.cpuPower = cpuPower;
    }

    public Double getRam() {
        return ram;
    }

    public void setRam(Double ram) {
        if (ram <= 0)
        {
            throw new IllegalArgumentException("Must be greater than Zero");

        }
        this.ram = ram;

    }

    // Only double datatype value can be multiplied in this abstract method
    @Override
    public double evalutePerformance() {
        return cpuPower * ram;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %f%n%s %f" , super.toString() , "CPU POWER" , getCpuPower(), "RAM" , getRam());
    }
}
