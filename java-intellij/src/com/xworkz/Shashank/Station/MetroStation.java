package com.xworkz.Shashank.Station;

public class MetroStation {

    String name;
    double cost;
    String from;
    String to;

    public MetroStation(double cost, String name, String from, String to) {
        this.cost = cost;
        this.name = name;
        this.from = from;
        this.to = to;
    }
    public void info(){
        System.out.println("Information of the MetroStation");
    }
}
