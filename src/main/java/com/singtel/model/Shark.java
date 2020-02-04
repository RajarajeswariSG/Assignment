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

    @Override
    public String name() {
        return "shark";
    }
}