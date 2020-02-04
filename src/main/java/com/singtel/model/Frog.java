package com.singtel.model;

public class Frog extends Animal{
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
        return true;
    }

    @Override
    public void swim() {

    }

    @Override
    public boolean canWalk() {
        return false;
    }

    @Override
    public void walk() {
        throw  new RuntimeException("I can't Walk");
    }

    @Override
    public String name() {
        return "Frog";
    }
}
