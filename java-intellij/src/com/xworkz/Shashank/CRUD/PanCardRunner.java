package com.xworkz.Shashank.CRUD;

public class PanCardRunner {
    public static void main(String[] args) {
        PanCard panCard=new PanCard("Shashank",22,false,100,"12-09-2028");
        PanCard[] pans = new PanCard[4];
        PanCardOperation panCardOperation=new PanCardOperation(pans);
        panCardOperation.store(panCard);
        panCardOperation.search("Shashank");
        panCardOperation.update(0,"Kishor");

    }
}
