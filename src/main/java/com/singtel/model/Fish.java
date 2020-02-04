package com.singtel.model;

public class Fish extends Animal {
    @Override
    public void swim() {
        System.out.println("I am Fish ,can Swim");
    }

    public String bodySize() {
        return null;
    }

    public String bodyColor() {
        return null;
    }

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
        return false;
    }

    @Override
    public void sing() {
        throw  new RuntimeException("I can't Sing");
    }

    @Override
    public boolean canSwim() {
        return true;
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
        return "Fish";
    }
}
