package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int countExtraCheese=0;
    private int countExtraVegToppings=0;
    private int countExtraNonVegToppings=0;
    private int  takeAway;
    public boolean isDeluxe;

    public void setPrice(int price) {
        this.price = price;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price=isVeg==true?300:400;
        this.bill="";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(countExtraCheese==0 && !isDeluxe) {
            this.price+=80;
        }
        countExtraCheese++;
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg && !isDeluxe){
            if(countExtraVegToppings==0) {
                this.price+=70;
            }
            countExtraVegToppings++;

        }else if(this.isVeg==false && !isDeluxe){
            if(countExtraNonVegToppings==0) {
                this.price+=120;
            }
            countExtraNonVegToppings++;

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAway==0)
          this.price+=20;
        takeAway++;


    }

    public String getBill(){
        // your code goes here
       if(isVeg){
               bill+="Base Price Of The Pizza: 300\n";

       }else{
               bill+="Base Price Of The Pizza: 400\n";
       }

       if(isDeluxe){
           this.price+=80;
           bill+="Extra Cheese Added: "+80+"\n";
           if(isVeg){
                this.price+=70;
                bill+="Extra Toppings Added: "+70+"\n";
           }else{
               this.price+=120;
               bill+="Extra Toppings Added: "+120+"\n";
           }
       }

       else{
           if(countExtraCheese>0){
               bill+="Extra Cheese Added: "+(80)+"\n";
           }
           if(countExtraVegToppings>0){
               bill+="Extra Toppings Added: "+(70)+"\n";
           }
           if(countExtraNonVegToppings>0){
               bill+="Extra Toppings Added: "+(120)+"\n";
           }
       }

       if(takeAway>0){
           bill+="Paperbag Added: "+(20)+"\n";
       }


       bill+="Total Price: "+this.price;

        return this.bill;
    }
}
