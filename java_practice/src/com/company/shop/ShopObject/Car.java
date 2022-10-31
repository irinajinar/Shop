package com.company.shop.ShopObject;

import com.company.shop.DepositCategory.Autovehicle;
import com.company.shop.werehouse.DepositProduct;

import java.util.ArrayList;

public class Car extends Autovehicle {
    private String carColor;
    private double maxSpeed;
    private String brandOfTheCar;


    public Car(ArrayList<DepositProduct> autovehicleCategory, int pcs, double price, int pcs1, String black, int maxSpeed, String mercedes) {
    }

    @Override
    public String toString() {
        return "Car{" +
                "carColor='" + carColor + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", brandOfTheCar='" + brandOfTheCar + '\'' +
                '}';
    }
}
