package com.company.shop.ShopObject;

import com.company.shop.DepositCategory.Electronics;
import com.company.shop.werehouse.DepositProduct;

import java.util.ArrayList;

public class Computer extends Electronics {

    private String description;

    public Computer(String objectName, double price, String category, int pcs, String description) {
        super(objectName, price, category, pcs);
        this.description = description;

    }


    @Override
    public String toString() {
        return "Computer{" +
                "description='" + description + '\'' +
                '}';
    }
}
