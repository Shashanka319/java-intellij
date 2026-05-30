package com.xworkz.oops.interface_concept;

public class Petrol_Car_Runner {
    public static void main(String[] args) {
        Petrol_Car petrolCar = new Petrol_Car();
        petrolCar.drive();
        petrolCar.engine();
        petrolCar.car_info();
        petrolCar.stop();
        petrolCar.car_status();
        petrolCar.start();
        System.out.println("Car Price:"+Car.price);
        System.out.println("Car Color:"+Car.color);
    }
}
