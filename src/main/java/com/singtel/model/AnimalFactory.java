package com.singtel.model;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if(type.equals("BIRD"))
            return new Bird();
        else if (type.equals("DUCK"))
            return new Duck();
        else if (type.equals("CHICKEN"))
            return new Chicken();
        else if (type.equals("PARROT"))
            return new Parrot();
        else if (type.equals("FISH"))
            return new Fish();
        else if (type.equals("SHARK"))
            return new Fish();
        else if (type.equals("CLOWNFISH"))
            return new ClownFish();
        else if (type.equals("DOLPHIN"))
            return new Dolphin();
        else if (type.equals("BUTTERFLY"))
            return new Butterfly();
        else if (type.equals("CATERPILLAR"))
            return new CatterPillar();
        else
            return null;
    }
}
