package com.xworkz.Shashank.CRUD;

public class MedicalOperation {
    Medical[] medicals;
    int currentIndex;
    MedicalOperation(Medical[] medicals){
        this.medicals=medicals;
    }
    void store(Medical medical){
        if(this.medicals!=null&&medical!=null){
            int index=this.medicals.length-1;
            if(this.currentIndex<=index){
                this.medicals[currentIndex]=medical;
                medical.info();
                currentIndex++;
            }else{
                System.out.println("not storeing deu to array is full");
            }
        }
    }
    void search(boolean license){
        if(this.medicals!=null && license!=false){
            for(Medical medical:this.medicals){
                if(medical!=null){
                    if(medical.license==license){
                        System.out.println("The Information of Medical Found based On this License");
                        medical.info();
                    }
                }
            }
        }
    }
    void update(String owner, String ownerName){
        if(this.medicals!=null && owner!=null && ownerName!=null){
            for(Medical medical:this.medicals){
                if(medical!=null){
                    if(medical.ownerName==owner)
                        medical.ownerName=ownerName;
                    System.out.println("Before Updating the Owner Name:"+owner);
                    System.out.println("Updated Owner Name:"+ownerName);
                }
            }
        }
    }
}
