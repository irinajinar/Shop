package com.company.shop;

import com.company.shop.ShopObject.Car;
import com.company.shop.ShopObject.Chair;
import com.company.shop.ShopObject.Computer;

import java.util.ArrayList;

//**User cu atributele:nume, prenume, salariu,parola
//Shop cu atributele:o lista de obiecte
//clasa computer, masina, scaun, care sa mosteneasca clasa de obiecte creata mai sus clasa de baza se va numi ShopObject(ps: nu poti crea o clasa numita Object deoarece exista deja in java)
//ShopObject(pui pretu)
public class Main {
    public static void main(String[] args) {

        User firstUser = new User("Sara", "Wilson", 600, "Aa22!");
        User secondUser = new User("Luca", "Johnson", 800, "Bb34*");

        Computer computer = new Computer("Dell computer", 150, "9 RAM");
        Computer computer1 = new Computer("Lenovo computer", 140, "6 RAM");
        Car car = new Car("Car", 500, "Mercedes", "red", 180);
        Chair chair = new Chair("Living Chair", 36, "red", 4, true);

        System.out.println("----------------Deposit Metods-----------------------------");
        ArrayList<ObjectToBuy> depositProducts = new ArrayList<>();
        Deposit depositI = new Deposit("DepositI", depositProducts);

        Deposit.addObjectInDeposit(depositProducts, computer);
        Deposit.addObjectInDeposit(depositProducts, computer1);
        Deposit.addObjectInDeposit(depositProducts, car);
        System.out.println(Deposit.addObjectInDeposit(depositProducts, chair));
        System.out.println(Deposit.removeObjectInDeposit(depositProducts, chair));


        System.out.println("----------------Shop Metods--------------------------------");
        ArrayList<ObjectToBuy> shopProducts = new ArrayList<>();
        Shop shopI = new Shop("ShopI", shopProducts);
        System.out.println(Shop.addProduct(computer, depositProducts, shopProducts));
        System.out.println(Shop.addListOfProducts(depositProducts, shopProducts));


        System.out.println("----------------User Metods--------------------------------");
        ArrayList<ObjectToBuy> boughtFirstUserList = new ArrayList<>();
        System.out.println(User.buyProduct(car, boughtFirstUserList, shopProducts));
        ArrayList<ObjectToBuy> boughtSecondUserList = new ArrayList<>();
        System.out.println(User.sellProduct(car, boughtFirstUserList, boughtSecondUserList));
        System.out.println(User.checkSellProduct(car, boughtFirstUserList, boughtSecondUserList));

    }
}
