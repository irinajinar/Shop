package com.company.shop.ShopObject;

import com.company.shop.ObjectToBuy;

public class Computer extends ObjectToBuy {

        private String memory;

    public Computer(String objectName, double price, String memory) {
        super(objectName, price);
        this.memory = memory;
    }

    public Computer(String memory) {
        super();
        this.memory = memory;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memory='" + memory + '\'' +
                '}';
    }
}

