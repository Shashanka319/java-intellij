package com.xworkz.Shashank.CRUD;

public class Medical {
    String name;
    String location;
    boolean license;
    String ownerName;
    double revenue;

    public Medical(String name, String location, boolean license, String ownerName, double revenue) {
        this.name = name;
        this.location = location;
        this.license = license;
        this.ownerName = ownerName;
        this.revenue = revenue;
    }
    void info(){
        System.out.println("Name:"+this.name);
        System.out.println("Location:"+location);
        System.out.println("License:"+this.license);
        System.out.println("Owner name:"+this.ownerName);
        System.out.println("Revenue:"+this.revenue);
    }
}
