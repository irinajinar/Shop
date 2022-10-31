package com.company.shop;

import com.company.shop.DepositCategory.Autovehicle;
import com.company.shop.DepositCategory.Electronics;
import com.company.shop.DepositCategory.Furniture;
import com.company.shop.ShopObject.Car;
import com.company.shop.ShopObject.Chair;
import com.company.shop.ShopObject.Computer;
import com.company.shop.UserUtils.UserPersonalObject;
import com.company.shop.UserUtils.UserPersonalTransaction;
import com.company.shop.UserUtils.UserShoppingList;
import com.company.shop.werehouse.Deposit;
import com.company.shop.werehouse.DepositProduct;
import com.company.shop.werehouse.DepositsUtil;

import java.util.ArrayList;

//**User cu atributele:nume, prenume, salariu,parola
//Shop cu atributele:o lista de obiecte
//clasa computer, masina, scaun, care sa mosteneasca clasa de obiecte creata mai sus clasa de baza se va numi ShopObject(ps: nu poti crea o clasa numita Object deoarece exista deja in java)
//ShopObject(pui pretu)
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<DepositProduct>> depositProducts = new ArrayList<ArrayList<DepositProduct>>();
        ArrayList<DepositProduct> electronicsCategory = new ArrayList<DepositProduct>();
        ArrayList<DepositProduct> autovehicleCategory = new ArrayList<DepositProduct>();
        ArrayList<DepositProduct> furnitureCategory = new ArrayList<DepositProduct>();

        DepositProduct electronic = new DepositProduct("Electronic Products", 0);
        DepositProduct autovehicle = new DepositProduct("Autovehicle", 0);
        DepositProduct furniture = new DepositProduct("Furniture", 6);

        UserPersonalObject object1 = new UserPersonalObject("table", 30);
        UserPersonalObject object2 = new UserPersonalObject("desk", 60);
        UserPersonalObject object3 = new UserPersonalObject("phone", 90);
        UserPersonalObject object4 = new UserPersonalObject("PC", 60);

        User firstUser = new User("Sara", "Wilson", 600, "Aa22!");
        User secondUser = new User("Luca", "Johnson", 800, "Bb34*");

        Computer computer = new Computer("Dell computer", electronic.getPcs(), electronic.getCategory(), 300, "9 RAM");
        Computer computer1 = new Computer("Lenovo computer", electronic.getPrice(), electronic.getCategory(), 300, "6 RAM");
        Car car = new Car(autovehicleCategory, autovehicle.getPcs(), autovehicle.getPrice(), 6, "black", 180, "Mercedes");
        Chair chair = new Chair(furnitureCategory, "Living Chair", 100, 4, "white", true);

        Shop shopI = new Shop();
        Deposit depositI = new Deposit();

        System.out.println("----------------WereHouse Metods--------------------------------");
        System.out.println(Electronics.addElectronicalProduct(electronicsCategory, computer));
        System.out.println(Electronics.addElectronicalProduct(electronicsCategory, computer1));
        System.out.println(DepositsUtil.addObjectCategory(depositProducts, electronicsCategory));

        System.out.println(Autovehicle.addAutovehicleObject(autovehicleCategory, car));
        System.out.println(DepositsUtil.addObjectCategory(depositProducts, autovehicleCategory));

        System.out.println(Furniture.addFurnitureProduct(furnitureCategory, chair));
        System.out.println(DepositsUtil.addObjectCategory(depositProducts, furnitureCategory));

        System.out.println("----------------Shop Metods--------------------------------");

        System.out.println(shopI.addObjects(depositProducts));
        System.out.println(shopI.removeObjects(computer1));

        UserShoppingList.shopping(firstUser, electronicsCategory, computer1, shopI.objectsAvailableInShop);

        System.out.println("------User Metods------------------------------------------");

        ArrayList<UserPersonalObject> firstUserPersonalObject = new ArrayList<UserPersonalObject>();
        ArrayList<UserPersonalObject> secondUserPersonalObject = new ArrayList<UserPersonalObject>();

        System.out.println(UserPersonalTransaction.checkObjectValue(firstUser, object1, firstUserPersonalObject));
        System.out.println(UserPersonalTransaction.addPersonalObject(object1, firstUserPersonalObject));
        System.out.println(UserPersonalTransaction.addPersonalObject(object3, firstUserPersonalObject));
        System.out.println(UserPersonalTransaction.addPersonalObject(object2, secondUserPersonalObject));
        System.out.println(UserPersonalTransaction.addPersonalObject(object4, secondUserPersonalObject));
        System.out.println(UserPersonalTransaction.checkObjectValue(secondUser, object1, secondUserPersonalObject));

        System.out.println(UserPersonalTransaction.sellPersonalObject(firstUserPersonalObject, secondUserPersonalObject, object1, firstUser, secondUser));

    }
}
