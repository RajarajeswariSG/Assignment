package com.singtel.model;

public class AnimalInfo {
    private String type;
    private String name;
    private String swim;
    private String walk;
    private String sing;

    /**
     *
     */
    public AnimalInfo() {
    }

    /**
     *
     * @param type
     * @param name
     * @param swim
     * @param walk
     * @param sing
     */
    public AnimalInfo(String type, String name, String swim, String walk, String sing) {
        this.type = type;
        this.name = name;
        this.swim = swim;
        this.walk = walk;
        this.sing = sing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSwim() {
        return swim;
    }

    public void setSwim(String swim) {
        this.swim = swim;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public String getSing() {
        return sing;
    }

    public void setSing(String sing) {
        this.sing = sing;
    }
}
