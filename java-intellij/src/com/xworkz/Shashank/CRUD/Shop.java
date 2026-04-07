package com.xworkz.Shashank.CRUD;

public class Shop
{
    String name;
    String location;
    boolean stackAvailable;
    int investmentCost;
    double profit;

    public Shop(String name, String location, boolean stackAvailable, int investmentCost, double profit) {
        this.name = name;
        this.location = location;
        this.stackAvailable = stackAvailable;
        this.investmentCost = investmentCost;
        this.profit = profit;
    }
    public void info(){
        System.out.println("Name:"+this.name);
        System.out.println("Location:"+this.location);
        System.out.println("Stack Available:"+this.stackAvailable);
        System.out.println("Profit:"+this.profit);
    }
}
