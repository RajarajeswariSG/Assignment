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
}
