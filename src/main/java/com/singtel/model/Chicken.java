package com.singtel.model;

public class Chicken extends Bird {
    @Override
    public void fly() {
        System.out.println("A chicken cannot fly");
    }

    @Override
    public void sing() {
        System.out.println("A chicken says: “Cluck, cluck");
    }
}
