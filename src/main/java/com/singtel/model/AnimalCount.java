package com.singtel.model;

public class AnimalCount{

    public static void main(String[] args) {

    Animal[] animals = new Animal[]{
            new Bird(),
            new Duck(),
            new Chicken(),
            new Rooster(false),
            new Parrot(),
            new Fish(),
            new Shark(),
            new ClownFish(),
            new Dolphin(),
            new Frog(),
            new Dog(),
            new Butterfly(),
            new Cat()
    };

    /** Animal Count Logic**/
    int singAnimalCount = 0;
    int walkAnimalCount = 0;
    int swimAnimalCount = 0;
    int flyAnimalCount = 0;
    for(Animal animal: animals){
        if(animal instanceof Sing) singAnimalCount++;
        if(animal instanceof Walk) walkAnimalCount++;
        if(animal instanceof Swim) swimAnimalCount++;
        if(animal instanceof Fly) flyAnimalCount++;
    }
    System.out.print("singAnimalCount: "+singAnimalCount +";"+"walkAnimalCount: "+walkAnimalCount +";"+"swimAnimalCount: "+swimAnimalCount+";"+"flyAnimalCount: "+flyAnimalCount);


}

}
