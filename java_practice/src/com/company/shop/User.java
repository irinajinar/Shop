package com.company.shop;

public class User {
    private String firstName;
    private String secondName;
    private double salary;
    private String password;

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

}
