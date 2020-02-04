package com.singtel.model;

public class Butterfly extends CatterPillar{

    @Override
    public void fly(){
        System.out.println("I am Butterfly ,can fly");
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public String name() {
        return "Butterfly";
    }

}
