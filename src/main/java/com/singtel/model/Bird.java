package com.singtel.model;

public class Bird extends Animal implements Sing,Swim,Fly{
   public void fly() {
        System.out.println("I am flying");
    }
    /**1.Added the sing() method for the bird**/
    public void sing(){
        System.out.println("I am Singing");
    }
    public void swim() {
        System.out.println("A duck can swim");
    }

    /**4.Model Parrot**/
    public void walk() {
        System.out.println("I am walking");
    }

    private ParrotAction parrotAction;

    /** By Default Constructor ,bird is Singing*/
    public Bird() {
        this.parrotAction = new ParrotAction(AnimalSoundEnums.DEFAULT);
    }

    /** By Parameterised Constructor ,Based on different parameter bird sing*/
    public Bird(ParrotAction parrotAction) {
        this.parrotAction = parrotAction;
    }

    public void callSound() {
        parrotAction.makeSound();
    }
}
