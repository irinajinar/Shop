package com.company.shop.UserUtils;

import java.util.ArrayList;

public class UserPersonalObject {
    private String objectName;
    private double objectValue;

    public UserPersonalObject(String objectName, double objectValue) {
        this.objectName = objectName;
        this.objectValue = objectValue;
    }

       public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public double getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(double objectValue) {
        this.objectValue = objectValue;
    }

    @Override
    public String toString() {
        return "UserPersonalObject{" +
                "objectName='" + objectName + '\'' +
                ", objectValue=" + objectValue +
                '}';
    }


}
