package com.company.shop;

public class ObjectToBuy {
    private String objectName;
    private double price;

    public ObjectToBuy(String objectName, double price) {
        this.objectName = objectName;
        this.price = price;
    }

    public ObjectToBuy() {

    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
