package com.company.shop;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String secondName;
    private double salary;
    private String password;
    private ArrayList<ObjectToBuy> boughtObjects;

    public User(String firstName, String secondName, double salary, String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", password='" + password + '\'' +
                '}';
    }


    public static ArrayList<ObjectToBuy> buyProduct(ObjectToBuy object, ArrayList<ObjectToBuy> boughtUserList, ArrayList<ObjectToBuy> shopProducts) {
        if (shopProducts.contains(object)) {
            shopProducts.remove(object);
            boughtUserList.add(object);
        } else {
            System.out.println("The product you want is not available");
        }

        return boughtUserList;
    }


    public static ArrayList<ObjectToBuy> sellProduct(ObjectToBuy object, ArrayList<ObjectToBuy> boughtFirstUserList, ArrayList<ObjectToBuy> boughtSecondUserList) {
        if (boughtFirstUserList.contains(object)) {
            boughtFirstUserList.remove(object);
            boughtSecondUserList.add(object);
            System.out.println(boughtFirstUserList);
        } else {
            System.out.println("Error transaction");
        }
        return boughtSecondUserList;
    }

    public static boolean checkSellProduct(ObjectToBuy object, ArrayList<ObjectToBuy> boughtFirstUserList, ArrayList<ObjectToBuy> boughtSecondUserList) {
        if (boughtFirstUserList.contains(object)) {
            boughtFirstUserList.remove(object);
            boughtSecondUserList.add(object);
            return true;
        }
         else {
            System.out.println("Error transaction");
            return false;
        }
    }
}
//cumpara(shop,object)->boughtObjects noua lista
//vinde(buyer, object)-> boolean tranzatie


