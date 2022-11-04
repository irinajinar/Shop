package com.company.shop;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ObjectToBuy> shopProducts;

    public Shop(String name, ArrayList<ObjectToBuy> shopProducts) {
        this.name = name;
        this.shopProducts = shopProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ObjectToBuy> getShopProducts() {
        return shopProducts;
    }

    public void setShopProducts(ArrayList<ObjectToBuy> shopProducts) {
        this.shopProducts = shopProducts;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", shopProducts=" + shopProducts +
                '}';
    }

    public static ArrayList<ObjectToBuy> addProduct(ObjectToBuy object, ArrayList<ObjectToBuy> depozitProducts, ArrayList<ObjectToBuy> shopProducts) {
        if (depozitProducts.contains(object)) {
            depozitProducts.remove(object);
            shopProducts.add(object);
        } else {
            System.out.println("Error");
        }
        return shopProducts;
    }

    public static ArrayList<ObjectToBuy> addListOfProducts(ArrayList<ObjectToBuy> depozitProducts, ArrayList<ObjectToBuy> shopProducts) {
        shopProducts.addAll(depozitProducts);
        return shopProducts;
    }
}
