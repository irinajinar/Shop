package com.company.shop;

import com.company.shop.werehouse.DepositProduct;

import java.util.ArrayList;

public class Shop {
    ArrayList<ArrayList<ArrayList<DepositProduct>>> objectsAvailableInShop = new ArrayList<ArrayList<ArrayList<DepositProduct>>>();

    public Shop(){

    }

    public ArrayList<ArrayList<ArrayList<DepositProduct>>> addObjects(ArrayList<ArrayList<DepositProduct>> depositProducts) {
        objectsAvailableInShop.add(depositProducts);
        return objectsAvailableInShop;

    }


    public ArrayList<ArrayList<ArrayList<DepositProduct>>> removeObjects(DepositProduct object) {
        objectsAvailableInShop.remove(object);
        return objectsAvailableInShop;

    }
}
