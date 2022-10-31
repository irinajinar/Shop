package com.company.shop.ShopObject;

import com.company.shop.werehouse.DepositProduct;

import java.util.ArrayList;

public class Chair extends DepositProduct {
    private int chairLegs;
    private String color;
    private boolean backChair;

    public Chair(ArrayList<DepositProduct> furnitureCategory, String living_chair, int i, int i1, String white, boolean b) {
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
