package com.xworkz.oops.interface_concept;

import java.util.logging.Logger;

public class Petrol_Car implements Car{
    public void drive(){
        System.out.println("Executing the Drive in Petrol_Car");
    }

    @Override
    public void engine() {
        System.out.println("Executing the engine in Petrol_Car");
    }

    public  void stop(){
        System.out.println("Executing the stop in Petrol_Car");
    }

    public  void start(){
        System.out.println("Executing the start in Petrol_Car");
    }




}
