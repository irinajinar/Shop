package com.company.shop.DepositCategory;

import com.company.shop.ShopObject.Computer;
import com.company.shop.werehouse.DepositProduct;

import java.util.ArrayList;

public class Electronics extends DepositProduct {


    public Electronics(String objectName, double price, String category, int pcs) {
        super(objectName, price, category, pcs);
    }

    public Electronics(String category, int pcs) {
        super(category, pcs);
    }

    public Electronics() {
        super();
    }

    public static ArrayList<DepositProduct> addElectronicalProduct(ArrayList<DepositProduct> electronicsCategory, Computer computer) {
        electronicsCategory.add(computer);
        return electronicsCategory;

    }


}