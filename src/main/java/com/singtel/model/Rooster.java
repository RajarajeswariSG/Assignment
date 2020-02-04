package com.singtel.model;

public class Rooster extends Animal {

    boolean isChicken;
    public Rooster(boolean isChicken) {
        this.isChicken = isChicken;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public void fly() {

    }

    @Override
    public boolean canSing() {
        return false;
    }

    public void sing() {
        /** 1.isChicken value is true ,say Cluck cluck [Chicken] ;
         * 2.isRooster value is false ,say Cock-a-doodle-doo  **/
        if (isChicken) {
            System.out.println("I am Chicken,my sound is Cluck cluck");
        } else {
            System.out.println("I am Rooster ,my sound is Cock-a-doodle-doo");
        }
    }

    @Override
    public boolean canSwim() {
        return false;
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

    }


}
