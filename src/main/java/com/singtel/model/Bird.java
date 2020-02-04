package com.singtel.model;

public class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
    /**1.Added the sing() method for the bird**/
    void sing(){
        System.out.println("I am Singing");
    }

    void swim() {
        System.out.println("A duck can swim");
    }
}
