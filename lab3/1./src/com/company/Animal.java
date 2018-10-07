package com.company;

public class Animal {
    private String color;

    public Animal(){
        this.color = "Black";

    }

    public Animal(String initialColor){
        this.color = initialColor;

    }

    public String info() {
        return color;
    }


}


