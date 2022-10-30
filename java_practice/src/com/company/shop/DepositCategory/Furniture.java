package com.company.shop.DepositCategory;

import com.company.shop.ShopObject.Chair;
import com.company.shop.werehouse.DepositProduct;

import java.util.ArrayList;

public class Furniture extends DepositProduct {
    public Furniture(String objectName, double price, String category, int pcs) {
        super(objectName, price, category, pcs);
    }

    public Furniture(String category, int pcs) {
        super(category, pcs);
    }

    public Furniture() {
    }

    public static ArrayList<DepositProduct> addFurnitureProduct(ArrayList<DepositProduct> furnitureCategory, Chair chair) {
        furnitureCategory.add(chair);
        return furnitureCategory;

    }


}
