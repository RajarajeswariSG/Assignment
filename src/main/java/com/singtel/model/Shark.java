package com.singtel.model;

public class Shark extends Fish {

    @Override
    public String bodySize() {
        return CommonConstants.SIZE_LARGE;
    }

    @Override
    public String bodyColor() {
        return CommonConstants.COLOUR_GREY;
    }

    public String eatFish() {
        return CommonConstants.SHARK_EAT_FISH;
    }

    public static void main(String[] args) {
        Shark shark = new Shark();
        shark.bodyColor();
        shark.bodySize();
        shark.eatFish();
        System.out.println("Shark Color ->"+shark.bodyColor() +" "+"Shark Size ->"+shark.bodySize()+" "+"Shark Eat ->"+shark.eatFish());
    }
}