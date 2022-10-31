package com.company.shop.werehouse;

import java.util.ArrayList;

public class DepositsUtil {

    private static ArrayList<DepositProduct> electronicsCategory;

    public DepositsUtil() {

    }

    public static ArrayList<ArrayList<DepositProduct>> addObjectCategory(ArrayList<ArrayList<DepositProduct>> depositProducts, ArrayList<DepositProduct> electronicsCategory) {
        DepositsUtil.electronicsCategory = electronicsCategory;
        depositProducts.add(electronicsCategory);
        return depositProducts;

    }


}
