package com.singtel.model;

public enum AnimalSoundEnums {

    DUCK(CommonConstants.DUCK_SOUND),
    ROOSTER(CommonConstants.ROOSTER_SOUND),
    DOG(CommonConstants.DOG_SOUND),
    CAT(CommonConstants.CAT_SOUND),
    DEFAULT(CommonConstants.DEFAULT),
    NO_SOUND(CommonConstants.NO_SOUND);

    private String animalsSound;

    AnimalSoundEnums(String animalsSound){
        this.animalsSound = animalsSound;
    }

    public String getAnimalsSound(){
        return animalsSound;
    }
}
