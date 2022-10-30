package com.company.shop.ShopObject;

import com.company.shop.DepositCategory.Autovehicle;
import com.company.shop.werehouse.DepositProduct;

import java.util.ArrayList;

public class Car extends Autovehicle {
    private String carColor;
    private double maxSpeed;
    private String brandOfTheCar;

    public Car(String objectName, double price, String category, int pcs, String carColor, double maxSpeed, String brandOfTheCar) {
        super(objectName, price, category, pcs);
        this.carColor = carColor;
        this.maxSpeed = maxSpeed;
        this.brandOfTheCar = brandOfTheCar;
    }

    public Car(String category, int pcs, String carColor, double maxSpeed, String brandOfTheCar) {
        super(category, pcs);
        this.carColor = carColor;
        this.maxSpeed = maxSpeed;
        this.brandOfTheCar = brandOfTheCar;
    }


    public Car(ArrayList<DepositProduct> autovehicleCategory, int pcs, double price, int pcs1, String black, int maxSpeed, String mercedes) {
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrandOfTheCar() {
        return brandOfTheCar;
    }

    public void setBrandOfTheCar(String brandOfTheCar) {
        this.brandOfTheCar = brandOfTheCar;
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
