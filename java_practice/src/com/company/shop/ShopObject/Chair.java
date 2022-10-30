package com.company.shop.ShopObject;

import com.company.shop.werehouse.DepositProduct;

import java.util.ArrayList;

public class Chair extends DepositProduct {
    private int chairLegs;
    private String color;
    private boolean backChair;

    public Chair(String objectName, double price, String category, int pcs, int chairLegs, String color, boolean backChair) {
        super(objectName, price, category, pcs);
        this.chairLegs = chairLegs;
        this.color = color;
        this.backChair = backChair;
    }

    public Chair(String category, int pcs, int chairLegs, String color, boolean backChair) {
        super(category, pcs);
        this.chairLegs = chairLegs;
        this.color = color;
        this.backChair = backChair;
    }

    public Chair(int chairLegs, String color, boolean backChair) {
        this.chairLegs = chairLegs;
        this.color = color;
        this.backChair = backChair;
    }

    public Chair(ArrayList<DepositProduct> furnitureCategory, String living_chair, int i, int i1, String white, boolean b) {
    }

    public int getChairLegs() {
        return chairLegs;
    }

    public void setChairLegs(int chairLegs) {
        this.chairLegs = chairLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                "chairLegs=" + chairLegs +
                ", color='" + color + '\'' +
                ", backChair=" + backChair +
                '}';
    }
}
