package com.xworkz.oops.interface_concept;

public interface Car {
    public static final double price=200000;
    String color="red";

    public abstract void drive();
    void engine();

    default void car_info(){
        System.out.println("Executing the Car information in Car");
    }
    default void car_status(){
        System.out.println("Executing the Car status");
        car_power();
    }

    private void car_power(){
        System.out.println("Executing the Car power");
    }
}
