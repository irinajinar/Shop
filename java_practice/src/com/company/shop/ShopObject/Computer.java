package com.company.shop.ShopObject;

import com.company.shop.DepositCategory.Electronics;
import com.company.shop.werehouse.DepositProduct;

import java.util.ArrayList;

public class Computer extends Electronics {

    private String description;
//    private Electronics electronicsProperty;


    public Computer(String objectName, double price, String category, int pcs, String description) {
        super(objectName, price, category, pcs);
        this.description = description;
//        this.electronicsProperty = electronicsProperty;
    }


    public Computer(String description, Electronics electronicsProperty) {
        this.description = description;
//        this.electronicsProperty = electronicsProperty;
    }

    public Computer(String category, int pcs, String description) {
        super(category, pcs);
        this.description = description;
    }

    public Computer(String description) {
        this.description = description;
    }

    public Computer(String objectName, double price, String description) {
        super(objectName, (int) price);
        this.description = description;
    }


    public Computer(ArrayList<DepositProduct> electronicsCategory, String dell_computer, int i, String s) {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "description='" + description + '\'' +
                '}';
    }
}
