package com.singtel.model;

public class AnimalCount{

    Animal[] animals;
    int singAnimalCount = 0;
    int walkAnimalCount = 0;
    int swimAnimalCount = 0;
    int flyAnimalCount = 0;

    public AnimalCount(Animal[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].canFly()) {
                flyAnimalCount += 1;
            }
            if (animals[i].canWalk()) {
                walkAnimalCount += 1;
            }
            if (animals[i].canSing()) {
                singAnimalCount += 1;
            }
            if (animals[i].canSwim()) {
                swimAnimalCount += 1;
            }
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getSingAnimalCount() {
        return singAnimalCount;
    }

    public void setSingAnimalCount(int singAnimalCount) {
        this.singAnimalCount = singAnimalCount;
    }

    public int getWalkAnimalCount() {
        return walkAnimalCount;
    }

    public void setWalkAnimalCount(int walkAnimalCount) {
        this.walkAnimalCount = walkAnimalCount;
    }

    public int getSwimAnimalCount() {
        return swimAnimalCount;
    }

    public void setSwimAnimalCount(int swimAnimalCount) {
        this.swimAnimalCount = swimAnimalCount;
    }

    public int getFlyAnimalCount() {
        return flyAnimalCount;
    }

    public void setFlyAnimalCount(int flyAnimalCount) {
        this.flyAnimalCount = flyAnimalCount;
    }

}
