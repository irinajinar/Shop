package com.company.shop.UserUtils;

import com.company.shop.ObjectToBuy;
import com.company.shop.User;
import com.company.shop.werehouse.DepositProduct;

import java.util.ArrayList;

public class UserShoppingList {

    public static ArrayList<ObjectToBuy> shopping(User user, ArrayList< DepositProduct> category, DepositProduct objectToBuy, ArrayList<ArrayList<ArrayList<DepositProduct>>> objectsAvailableInShop) {
        ArrayList<ObjectToBuy> userList = new ArrayList<ObjectToBuy>();
        if (userList.contains(objectToBuy)) {
            System.out.println("You already have this " + objectToBuy);
        } else {
            if (user.getSalary() > objectToBuy.getPrice()) {
                userList.add(objectToBuy);
                System.out.println(objectToBuy.getPcs());
                objectsAvailableInShop.remove(objectToBuy);

                objectToBuy.setPcs(objectToBuy.getPcs()-1);
                System.out.println(" This is the user list of shopping " + userList);
                System.out.println(" The shop's stock for the product " + objectToBuy+ " is only: "+ objectToBuy.getPcs());
            } else {
                System.out.println("you don't have enough");
            }

        }
        return userList;
    }






}


