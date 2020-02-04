package com.singtel.model;

public class  ClownFish extends Fish {

    @Override
    public String bodySize() {
        return CommonConstants.SIZE_SMALL;
    }

    @Override
    public String bodyColor() {
        return CommonConstants.COLOUR_ORANGE;
    }

    public String makeJokes() {
        return CommonConstants.CLOWN_FISH_JOKES;
    }

}
