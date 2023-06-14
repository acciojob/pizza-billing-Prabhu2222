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
        countExtraCheese++;
        this.price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg){
            countExtraVegToppings++;
            this.price+=70;

        }else{
            countExtraNonVegToppings++;
            this.price+=120;

        }
    }

    public void addTakeaway(){
        // your code goes here
        takeAway++;
        this.price+=20;


    }

    public String getBill(){
        // your code goes here
       if(isVeg){
           if(isDeluxe){
               bill+="Base Price Of The Pizza: 450\n";
           }else{
               bill+="Base Price Of The Pizza: 300\n";
           }
       }else{
           if(isDeluxe){
               bill+="Base Price Of The Pizza: 600\n";
           }else{
               bill+="Base Price Of The Pizza: 400\n";
           }
       }
       if(countExtraCheese>0){
           bill+="Extra Cheese Added = "+(countExtraCheese*80)+"\n";
       }
       if(countExtraVegToppings>0){
           bill+="Extra Toppings Added: "+(countExtraVegToppings*70)+"\n";
       }
       if(countExtraNonVegToppings>0){
           bill+="Extra Toppings Added: "+(countExtraNonVegToppings*120)+"\n";
       }
       if(takeAway>0){
           bill+="Paperbag Added: "+(takeAway*20)+"\n";
       }
       bill+="Total Price: "+this.price;

        return this.bill;
    }
}
