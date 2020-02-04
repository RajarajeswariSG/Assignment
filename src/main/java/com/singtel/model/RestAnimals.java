package com.singtel.model;

import java.util.ArrayList;
import java.util.List;

public class RestAnimals {

        public static List<Animal> animals;
        public static void main(String[] args) {
        animals = new ArrayList<Animal>();
        animals.add(AnimalFactory.getAnimal(CommonConstants.BIRD));
        animals.add(AnimalFactory.getAnimal(CommonConstants.DUCK));
        animals.add(AnimalFactory.getAnimal(CommonConstants.CHICKEN));
        animals.add(AnimalFactory.getAnimal(CommonConstants.PARROT));
        animals.add(AnimalFactory.getAnimal(CommonConstants.FISH));
        animals.add(AnimalFactory.getAnimal(CommonConstants.SHARK));
        animals.add(AnimalFactory.getAnimal(CommonConstants.CLOWNFISH));
        animals.add(AnimalFactory.getAnimal(CommonConstants.DOLPHIN));
        animals.add(AnimalFactory.getAnimal(CommonConstants.BUTTERFLY));
        animals.add(AnimalFactory.getAnimal(CommonConstants.CATERPILLAR));

        int fly = 0,sing = 0,swim = 0,walk = 0;

        for(Animal animal : animals ){
            if (animal.canFly())
                fly++;
            if(animal.canSwim())
                swim++;
            if(animal.canSing())
                sing++;
            if(animal.canWalk())
                walk++;
        }

        System.out.println("No of animals that can  fly is " + fly);
        System.out.println("No of animals that can  sing is " + sing);
        System.out.println("No of animals that can  swim is " + swim);
        System.out.println("No of animals that can  walk is " + walk);
    }
    }
