package com.xworkz.Shashank.CRUD;

public class Operation {
        Toy[] toys;
        int currentIndex;

        public Operation(Toy[] toys) {
            this.toys = toys;
        }
        public void store(Toy toy){
            System.out.println("Executing the toy Information in Toy");
            if(this.toys!=null && toy!=null){
                int index = this.toys.length-1;
                if(this.currentIndex<=index){
                    System.out.println("Proceed to Store the information of Toy");
                    this.toys[currentIndex]=toy;
                    System.out.println("Toy Store in Index:"+currentIndex);
                    currentIndex++;
                    toy.info();
                }else{
                    System.out.println("Array index not match check once...");
                }
            }else {
                System.out.println("toys and toy is Null Check once...");
            }
        }
        public void search(String names){
            if(this.toys!=null && names!=null){
                for(Toy toy:this.toys){
                    if(toy!=null){
                        System.out.println("toy is Not null Proceed to search"+names);
                        if(toy.name==names){
                            toy.info();
                        }

                    }
                }
            }

        }
    public void update(int index, String newName) {
        if (this.toys != null && newName != null) {
            if (index >= 0 && index < this.toys.length) {
                if (this.toys[index] != null) {
                    this.toys[index].name = newName;
                    System.out.println(" updating the name at index:"+index);
                    System.out.println("Updated toy at index " + index + " to " + newName);
                } else {
                    System.out.println("No toy found at index " + index + " to update.");
                }
            } else {
                System.out.println("Invalid index.");
            }
        }
    }

}
