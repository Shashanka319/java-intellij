package com.xworkz.Shashank.CRUD;

import java.sql.SQLOutput;

public class ShopOperation {
    Shop[] shops;
    int currentIndex;
    ShopOperation(Shop[] shops){
        this.shops=shops;
    }
    void save(Shop shop){
        if(this.shops!=null && shop!=null){
            int index=shops.length-1;
            if(this.currentIndex<=index){
               this.shops[currentIndex]=shop;
                System.out.println("The Shop Information are Store in :"+currentIndex);
               currentIndex++;
               shop.info();
            }
        }
    }
    boolean search (int invest){
        if( this.shops!=null && invest!=0){
            for(Shop shop:this.shops){
                if(shop!=null){
                    System.out.println("Proceed to Search:"+invest);
                    if(shop.investmentCost==invest){
                        System.out.println("The Shop Investment is availablein Array Index:"+shop.investmentCost);
                        shop.info();

                    }
                }
            }
        }return  false;
    }
    public void update(double profits,double newProfits){
        if(this.shops!=null && profits!=0 && newProfits!=0){
            for(Shop shop:this.shops){
                if(shop!=null){
                    if(shop.profit==profits)
                        shop.profit=newProfits;
                    System.out.println("before updated the Profit:"+profits);
                    System.out.println("updated Profits:"+newProfits);
                }
            }
        }
    }

}
