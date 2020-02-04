package com.singtel.model;

public class Duck extends Bird implements Swim,Sing {
    @Override
    public void sing() {
        System.out.println("A duck says: “Quack, quack”");
    }

    public void swim() {
        System.out.println("A duck can swim");
    }
}
