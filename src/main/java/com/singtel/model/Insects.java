package com.singtel.model;

public abstract class Insects extends Animal{
    @Override
    public String type() {
        return "insects";
    }

    @Override
    public String name() {
        return "Insects";
    }
}