package com.company.shop.ShopObject;

import com.company.shop.ObjectToBuy;

public class Car extends ObjectToBuy {
    private String brandOfTheCar;
    private String carColor;
    private double maxSpeed;

    public Car(String objectName, double price, String brandOfTheCar, String carColor, double maxSpeed) {
        super(objectName, price);
        this.brandOfTheCar = brandOfTheCar;
        this.carColor = carColor;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brandOfTheCar, String carColor, double maxSpeed) {
        this.brandOfTheCar = brandOfTheCar;
        this.carColor = carColor;
        this.maxSpeed = maxSpeed;
    }

    public String getBrandOfTheCar() {
        return brandOfTheCar;
    }

    public void setBrandOfTheCar(String brandOfTheCar) {
        this.brandOfTheCar = brandOfTheCar;
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

    @Override
    public String toString() {
        return "Car{" +
                "brandOfTheCar='" + brandOfTheCar + '\'' +
                ", carColor='" + carColor + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
