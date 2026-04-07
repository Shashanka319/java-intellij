package com.xworkz.Shashank.CRUD;

public class Medical {
    String name;
    boolean licence;
    double investment;
    String ownerName;
    int revenue;

    public Medical(String name, boolean licence, double investment, String ownerName, int revenue) {
        this.name = name;
        this.licence = licence;
        this.investment = investment;
        this.ownerName = ownerName;
        this.revenue = revenue;
    }
    void info(){
        System.out.println("Name:"+this.name);
        System.out.println("Licence:"+this.licence);
        System.out.println("Investment:"+this.investment);
        System.out.println("Owner Name:"+this.ownerName);
        System.out.println("Revenue:"+this.revenue);
    }
}

