package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int vegPrice=300;
    private int nonVegPrice=400;
    private int extraCheesePrice=80;
    private int extraVegToppingPrice=70;
    private int extraNonVegToppingPrice=120;
    private boolean isCheeseAdded;
    private boolean isVegToppingAdded;
    private boolean isNonVegToppingAdded;
    private boolean isTakeAway;
    private int bagPrice=20;
    private int basePrice;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        basePrice=isVeg?vegPrice:nonVegPrice;
        this.price=basePrice;
        bill="";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price+=extraCheesePrice;
            isCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVegToppingAdded==false && this.isVeg){
            isVegToppingAdded=true;
            this.price+=extraVegToppingPrice;
        }
        if(isNonVegToppingAdded==false && this.isVeg==false){
            isNonVegToppingAdded=true;
            this.price+=extraNonVegToppingPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAway==false){
            isTakeAway=true;
            this.price+=bagPrice;
        }
    }

    public String getBill(){
        // your code goes here
        bill+="Base Price Of The Pizza: "+basePrice+"\n";
        if(isCheeseAdded){
            bill+="Extra Cheese Added: "+extraCheesePrice+"\n";
        }
        if(isVegToppingAdded){
            bill+="Extra Toppings Added: "+extraVegToppingPrice+"\n";
        }
        if(isNonVegToppingAdded){
            bill+="Extra Toppings Added: "+extraNonVegToppingPrice+"\n";
        }
        if(isTakeAway){
            bill+="Paperbag Added: "+bagPrice+"\n";
        }
        bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
