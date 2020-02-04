package com.singtel.model;

public class CatterPillar  extends Insects {

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public void fly() {
        throw  new RuntimeException("I can't Fly");
    }

    @Override
    public boolean canSing()
    {
        return false;
    }

    @Override
    public void sing() {
        throw  new RuntimeException("I can't Sing");
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
    public void walk(){
        System.out.println("I am Caterpillar,can walk");
    }

    @Override
    public String name() {
        return "Catterpillar";
    }
}

