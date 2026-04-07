package com.xworkz.Shashank.CRUD;

public class MedicalOperation {
    Medical[] medicals;
    int currentIndex;
    MedicalOperation(Medical[] medicals){
        this.medicals=medicals;
    }
    void store(Medical medical){
        if(medicals!=null && medical!=null){
            int index=medicals.length-1;
            if(this.currentIndex<=index){
                System.out.println("Store the information of the Medical");
                this.medicals[currentIndex]=medical;
                medical.info();
                currentIndex++;
            }
        }
    }
    void check(boolean license){
        if(this.medicals!=null && license!=false){
            for(Medical medical:medicals){
                if(medical!=null){
                    System.out.println("Proceed To Search...in Array Index");
                    if(medical.licence==license){
                        System.out.println("The Licence is Available in the Array Index");
                        medical.info();
                    }
                }
            }
        }
    }
}
