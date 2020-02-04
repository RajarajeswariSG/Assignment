package com.singtel.model;

public class Metamorphosis {

    public Butterfly stage(CatterPillar catterPillar){
        catterPillar = null;
         return new Butterfly();
    }
}