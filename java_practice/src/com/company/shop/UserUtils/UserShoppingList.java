package com.company.shop.UserUtils;

import com.company.shop.ObjectToBuy;
import com.company.shop.User;

import java.util.ArrayList;

public class UserShoppingList {

    public static ArrayList<ObjectToBuy> shopping(User user, ObjectToBuy objectToBuy, ArrayList<ObjectToBuy> objectsToBuy) {
        ArrayList<ObjectToBuy> userList = new ArrayList<ObjectToBuy>();
        if (userList.contains(objectToBuy)) {
            System.out.println("You already have this " + objectToBuy);
        } else {
            if (user.getSalary() > objectToBuy.getPrice()) {
                userList.add(objectToBuy);
                objectsToBuy.remove(objectToBuy);
                System.out.println(" This is the user list of shopping " + userList);
                System.out.println(" This is the shop offer: " + objectsToBuy);
            } else {
                System.out.println("you don't have enough");
            }

        }
        return userList;
    }






}


