package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseDate;
    private String systemName;

    OperatingSystem(int releaseDate, String systemName){
        this.releaseDate = releaseDate;
        this.systemName = systemName;
    }
    public void turnOn(){
        System.out.println("System " + systemName + ". Release date: " + releaseDate + " is turning on.");
    }

    public void turnOf(){
        System.out.println("System " + systemName + ". Release date: " + releaseDate + " is turning of.");
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getSystemName() {
        return systemName;
    }
}
