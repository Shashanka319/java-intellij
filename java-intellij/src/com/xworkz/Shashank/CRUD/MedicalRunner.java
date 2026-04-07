package com.xworkz.Shashank.CRUD;

public class MedicalRunner {
    public static void main(String[] args) {
        Medical medical=new Medical("Jayalakshmi",true,1000000,"Shankar",50000);
        Medical[] medicals=new Medical[3];
        MedicalOperation medicalOperation=new MedicalOperation(medicals);
        medicalOperation.store(medical);
        medicalOperation.check(true);
    }
}
