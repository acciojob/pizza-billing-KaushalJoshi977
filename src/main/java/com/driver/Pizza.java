package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseAdded;
    private boolean toppingAdded;
    private boolean bagAdded;
    private int topping;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.toppingAdded = false;
        this.bagAdded = false;
        this.cheeseAdded = false;
        if(isVeg){
            this.price = 300;
            this.topping = 70;
        }
        else {
            this.price = 400;
            this.topping = 120;
        }
        this.bill = "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
            this.price += 80;
            cheeseAdded  = true;
        }
    }

    public void addExtraToppings(){
        if(!toppingAdded){
            this.price += topping;
            toppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(!bagAdded){
            this.price += 20;
            bagAdded = true;
        }
    }

    public String getBill(){

            if(cheeseAdded) this.bill += "Extra Cheese Added: " + 80 + "\n";
            if(toppingAdded) this.bill += "Extra Toppings Added: " + this.topping + "\n";
            if(bagAdded) this.bill += "Paperbag Added: " + 20 + "\n";
            this.bill += "Total Price: " + this.price;

        return this.bill;
    }
}
