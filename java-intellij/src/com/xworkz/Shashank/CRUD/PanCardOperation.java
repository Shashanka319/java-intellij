package com.xworkz.Shashank.CRUD;

public class PanCardOperation {
    PanCard[] panCards;
    int currentIndex;
    PanCardOperation(PanCard[] panCards){
        this.panCards=panCards;
    }
    void store(PanCard panCard){
        if(this.panCards!=null&& panCard!=null){
            int index=this.panCards.length-1;
            if(this.currentIndex<=index){
                this.panCards[currentIndex]=panCard;
                panCard.info();
                currentIndex++;

            }
        }
    }
    void search (String panCardName){
        if(this.panCards!=null&&panCardName!=null){
            for(PanCard panCard:this.panCards){
                if(panCard!=null){
                    if(panCard.name==panCardName){
                        panCard.info();
                    }
                }
            }
        }
    }
}
