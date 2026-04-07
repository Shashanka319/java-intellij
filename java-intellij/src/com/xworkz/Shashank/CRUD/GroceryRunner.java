package com.xworkz.Shashank.CRUD;

public class GroceryRunner {
    public static void main(String[] args) {
        Grocery grocery=new Grocery("Vegitables",1,80,"BTM Layout",true);
        Grocery[] groceries=new Grocery[10];
        GroceryOperation groceryOperation=new GroceryOperation(groceries);
        groceryOperation.store(grocery);
        groceryOperation.check("BTM Layout");
        groceryOperation.update("BTM Layout","Mejestic");
    }
}
