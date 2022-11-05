package com.company.shop;

import java.util.ArrayList;

public class Deposit {
    private String name;
    private ArrayList<ObjectToBuy> depositProducts;


    //adauga obiecte
    public static ArrayList<ObjectToBuy> addObjectInDeposit(ArrayList<ObjectToBuy> depositProducts, ObjectToBuy object) {
        depositProducts.add(object);
        return depositProducts;
    }

    // sterge obiecte
    public static ArrayList<ObjectToBuy> removeObjectInDeposit(ArrayList<ObjectToBuy> depositProducts, ObjectToBuy object) {
        depositProducts.remove(object);
        return depositProducts;
    }

    public Deposit(String name, ArrayList<ObjectToBuy> depositProducts) {
        this.name = name;
        this.depositProducts = depositProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ObjectToBuy> getDepositProducts() {
        return depositProducts;
    }

    public void setDepositProducts(ArrayList<ObjectToBuy> depositProducts) {
        this.depositProducts = depositProducts;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "name='" + name + '\'' +
                ", depositProducts=" + depositProducts +
                '}';
    }


}
