package com.xworkz.Shashank.CRUD;

public class PanCard {
    String name;
    int age;
    boolean expire;
    double cost;
    String expireDate;

    public PanCard(String name, int age, boolean expire, double cost, String expireDate) {
        this.name = name;
        this.age = age;
        this.expire = expire;
        this.cost = cost;
        this.expireDate = expireDate;
    }
    void info(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Expire:"+this.expire);
        System.out.println("Cost:"+this.cost);
        System.out.println("ExpireDate:"+expireDate);
    }
}
