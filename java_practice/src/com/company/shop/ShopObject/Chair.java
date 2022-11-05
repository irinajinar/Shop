package com.company.shop.ShopObject;

import com.company.shop.ObjectToBuy;

public class Chair extends ObjectToBuy {
    private String color;
    private int chairLegs;
    private boolean backChair;


    public Chair(String objectName, double price, String color, int chairLegs, boolean backChair) {
        super(objectName, price);
        this.color = color;
        this.chairLegs = chairLegs;
        this.backChair = backChair;
    }

    public Chair(String color, int chairLegs, boolean backChair) {
        this.color = color;
        this.chairLegs = chairLegs;
        this.backChair = backChair;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChairLegs() {
        return chairLegs;
    }

    public void setChairLegs(int chairLegs) {
        this.chairLegs = chairLegs;
    }

    public boolean isBackChair() {
        return backChair;
    }

    public void setBackChair(boolean backChair) {
        this.backChair = backChair;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "color='" + color + '\'' +
                ", chairLegs=" + chairLegs +
                ", backChair=" + backChair +
                '}';
    }
}