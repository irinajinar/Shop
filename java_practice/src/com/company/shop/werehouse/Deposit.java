package com.company.shop.werehouse;

import java.util.ArrayList;

public class Deposit {

    ArrayList<DepositProduct> depositProducts = new ArrayList<DepositProduct>();

    public Deposit() {

    }

    public ArrayList<DepositProduct> addProducts(DepositProduct depositCategory) {
        depositProducts.add(depositCategory);
        return depositProducts;
    }
}
