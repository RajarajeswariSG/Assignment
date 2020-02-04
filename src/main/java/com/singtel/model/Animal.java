package com.singtel.model;

public abstract class Animal {

    public String type()
    {
        return "animal";
    }
    public abstract String name();
    public abstract boolean canFly();
    public abstract void fly();
    public abstract boolean canSing();
    public abstract void sing();
    public abstract boolean canSwim();
    public abstract void swim();
    public abstract boolean canWalk();
    public abstract void walk();

}
