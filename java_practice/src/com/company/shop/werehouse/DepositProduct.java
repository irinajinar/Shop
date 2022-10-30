package com.company.shop.werehouse;

import com.company.shop.ObjectToBuy;

import java.util.ArrayList;

public class DepositProduct extends ObjectToBuy {
    private String category;
    private int pcs;

    public DepositProduct(String objectName, double price, String category, int pcs) {
        super(objectName, price);
        this.category = category;
        this.pcs = pcs;
    }

    public DepositProduct(String category, int pcs) {
        this.category = category;
        this.pcs = pcs;
    }

    public DepositProduct() {

    }

    public String getCategory() {
        return category;
    }

    public int getPcs() {
        return pcs;
    }

    public void setPcs(int pcs) {
        this.pcs = pcs;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "objectToBuy=" +
                ", pcs=" + pcs +
                '}';
    }
}
