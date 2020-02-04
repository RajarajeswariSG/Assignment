package com.singtel.model;

public class Rooster implements Sing {

    boolean isChicken;
    public Rooster(boolean isChicken) {
        this.isChicken = isChicken;
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

    public static void main(String[] args) {
        Rooster rooster = new Rooster(false);
        rooster.sing();
    }
}
