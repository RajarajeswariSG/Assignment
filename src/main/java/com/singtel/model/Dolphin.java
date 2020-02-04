package com.singtel.model;

public class Dolphin extends Fish{

   @Override
    public void swim() {
        System.out.println("I am good swimmer");
    }

    @Override
    public String name() {
        return "Dolphin";
    }
}
