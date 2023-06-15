package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        super.isDeluxe=true;
//        if(isVeg){
//            super.setPrice(super.getPrice()+80+70);
//        }else{
//            super.setPrice(super.getPrice()+80+120);
//        }

    }
}
