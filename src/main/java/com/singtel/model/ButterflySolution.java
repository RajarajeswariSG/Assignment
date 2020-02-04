package com.singtel.model;

public class ButterflySolution {
    public static void main(String[] args) {
        Butterfly b = new Butterfly();
        System.out.println("ButterFly");
        b.fly();

        CatterPillar c = new CatterPillar();
        System.out.println("CatterPillar");
        c.walk();

        Butterfly butterFlyFromCaterpillar = new Metamorphosis().stage(c);
        System.out.println("butterFlyFromCaterpillar");
        butterFlyFromCaterpillar.fly();
    }
}
