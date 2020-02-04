package com.singtel.model;

/** Parrot live with animals ,based on parameter it returns sound **/
public class ParrotAction {

    private AnimalSoundEnums animalSoundEnums;

    public ParrotAction(AnimalSoundEnums animalSoundEnums){
        this.animalSoundEnums = animalSoundEnums;
    }

    public void makeSound() {
        System.out.println(animalSoundEnums.getAnimalsSound());
    }

}
