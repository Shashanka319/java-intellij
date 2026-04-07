package com.xworkz.Shashank.CRUD;

public class GroceryOperation {
    Grocery[] groceries;
    int currentIndex;
    GroceryOperation(Grocery[] groceries){
        this.groceries=groceries;
    }
    void store(Grocery grocery){
        if(this.groceries!=null&&grocery!=null){
            int index=groceries.length-1;
            if(currentIndex<=index){
                this.groceries[currentIndex]=grocery;
                grocery.infoo();
                currentIndex++;
            }
        }
    }
    void check(String location){
        if(groceries!=null&& location!=null){
            for(Grocery grocery:this.groceries){
                if(grocery!=null){
                    if(grocery.location==location){
                        grocery.infoo();
                    }
                }
            }
        }
    }
}
