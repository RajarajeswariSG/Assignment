package com.singtel.model;

public class Solution {
    public static void main(String[] args) {
        /**A.1.**/
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        /*A.2.**/
        bird = new Duck();
        bird.sing();
        bird.swim();

        bird = new Chicken();
        bird.sing();
        bird.fly();
    }
}
