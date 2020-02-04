package com.singtel.model;

public class Duck extends Bird {
    @Override
    public void sing() {
        System.out.println("A duck says: “Quack, quack”");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void walk() {
        throw  new RuntimeException("I can't Fly");
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSing() {
        return super.canSing();
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return super.canWalk();
    }

    @Override
    public String name() {
        return "Duck";
    }
}
