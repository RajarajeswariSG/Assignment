package com.singtel.model;

public class Cat extends Animal {
    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public void fly() {
        throw  new RuntimeException("I can't Fly");
    }

    @Override
    public boolean canSing() {
        return true;
    }

    @Override
    public void sing() {

    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public void swim() {
        throw  new RuntimeException("I can't Swim");
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public void walk() {

    }

    @Override
    public String name() {
        return "Cat";
    }
}
