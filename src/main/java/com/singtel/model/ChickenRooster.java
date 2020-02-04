package com.singtel.model;

public class ChickenRooster extends Bird {
    private SexEnum sexEnum;
    @Override
    public void sing() {
        if (sexEnum.getSex().equals("MALE"))
            System.out.println("Cock-a-doodle-doo");
        else
            System.out.println("Cluck, cluck");
    }
}
