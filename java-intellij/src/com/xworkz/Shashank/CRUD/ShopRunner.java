package com.xworkz.Shashank.CRUD;

public class ShopRunner {
    public static void main(String[] args) {
        Shop shop=new Shop("Clothes","BTM Layout",true,500000,20000);
        Shop[] shops=new Shop[3];
        ShopOperation shopOperation=new ShopOperation(shops);
        shopOperation.save(shop);
        shopOperation.search(500000);
    }
}
