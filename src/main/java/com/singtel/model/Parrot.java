package com.singtel.model;

public class Parrot extends Bird {

    public Parrot() {
        super(new ParrotAction(AnimalSoundEnums.DEFAULT));
    }

    public Parrot(ParrotAction parrotAction) {
        super(parrotAction);
    }

    public void Fly() {
        System.out.println("I am Parrot ,can fly");
    }
}
