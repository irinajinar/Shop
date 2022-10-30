package com.company.shop.DepositCategory;

import com.company.shop.ShopObject.Car;
import com.company.shop.werehouse.DepositProduct;

import java.util.ArrayList;

public class Autovehicle extends DepositProduct {

    public Autovehicle(String objectName, double price, String category, int pcs) {
        super(objectName, price, category, pcs);
    }

    public Autovehicle(String category, int pcs) {
        super(category, pcs);
    }

    public Autovehicle() {
    }

    public static ArrayList<DepositProduct> addAutovehicleObject(ArrayList<DepositProduct> autovehicleCategory, Car car) {
        autovehicleCategory.add(car);
        return autovehicleCategory;

    }
}
