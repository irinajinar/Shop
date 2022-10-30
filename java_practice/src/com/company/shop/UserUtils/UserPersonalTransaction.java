package com.company.shop.UserUtils;

import com.company.shop.User;

import java.util.ArrayList;

public class UserPersonalTransaction {

    public UserPersonalTransaction() {
    }

    public static ArrayList<UserPersonalObject> addPersonalObject(UserPersonalObject object, ArrayList<UserPersonalObject> userPersonalList) {
        userPersonalList.add(object);
        return userPersonalList;
    }

    public static UserPersonalObject checkObjectValue(User user, UserPersonalObject object, ArrayList<UserPersonalObject> firstUserPersonalObject) {
//        firstUserPersonalObject.add(object);
        if (user.getSalary() > object.getObjectValue()) {
            System.out.println("You can buy this object");

        } else {
            System.out.println("You can't buy this object");
        }
        return object; //atentie poate fi boolean
    }

    public static ArrayList<UserPersonalObject> sellPersonalObject(ArrayList<UserPersonalObject> firstUserPersonalObject, ArrayList<UserPersonalObject> secondUserPersonalObject, UserPersonalObject object1, User user1, User user2) {
        if (firstUserPersonalObject.contains(object1)) {
            if (user2.getSalary() > object1.getObjectValue()) {
                firstUserPersonalObject.remove(object1);
                secondUserPersonalObject.add(object1);
                user2.setSalary(user2.getSalary()- object1.getObjectValue());
                System.out.println("The second user: " + user2);
            } else {
                System.out.println(" Error");
            }
        }
        return secondUserPersonalObject;
    }


//    public static UserPersonalTransaction sellPersonalObject(UserPersonalTransaction firstUserPersonalObject,UserPersonalTransaction secondUserPersonalObject, UserPersonalObject object) {
////    ArrayList<UserPersonalObject> user1List= new ArrayList<UserPersonalObject>();
//  user1List.add(object);
//    if(firstUserPersonalObject.contains(object)){
//        System.out.println("The object you can is: " + object);
//        user1List.remove(object);
//        secondUserPersonalObject.addPersonalObject(object);
//    }else{
//        System.out.println("You don't have anyting to sell ");
//    }
//    return secondUserPersonalObject;
//    }


}



