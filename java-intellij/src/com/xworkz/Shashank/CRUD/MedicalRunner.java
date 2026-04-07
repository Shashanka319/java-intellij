package com.xworkz.Shashank.CRUD;

public class MedicalRunner {
    public static void main(String[] args) {
        Medical medical=new Medical("Jayashree Medical","BTM Layout",true,"Shashank",1000);
        Medical[] medicals=new Medical[4];
        MedicalOperation medicalOperation=new MedicalOperation(medicals);
        medicalOperation.store(medical);
        medicalOperation.search(true);
        medicalOperation.update("Shashank","Shankar");
    }
}
