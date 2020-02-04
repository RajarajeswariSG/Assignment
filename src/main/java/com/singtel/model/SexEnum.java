package com.singtel.model;

public enum SexEnum {

    FEMALE("FEMALE"),
    MALE("MALE");

    private String sex;

    SexEnum(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }


}
