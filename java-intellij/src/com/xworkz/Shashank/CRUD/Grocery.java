package com.xworkz.Shashank.CRUD;

public class Grocery {
    String name;
    int count;
    double price;
    String location;
    boolean available;

    public Grocery(String name, int count, double price, String location, boolean available) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.location = location;
        this.available = available;
    }
    void infoo(){
        System.out.println("name:"+this.name);
        System.out.println("Count:"+this.count);
        System.out.println("Price:"+this.price);
        System.out.println("Location:"+this.location);
        System.out.println("available:"+this.available);
    }
}
