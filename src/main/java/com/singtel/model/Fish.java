package com.singtel.model;

public class Fish extends Animal implements Swim {

    public void swim() {
        System.out.println("I am Fish ,can Swim");
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.swim();
    }

   
}

