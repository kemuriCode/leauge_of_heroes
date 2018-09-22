package com.t0shi.model.heroes;

public class Mage implements ICanBeHero {

    private String name;

    private int strenght;
    private int defence;
    private int intelligence;
    private int dextrity;
    private int agillity;
    private int speed;

    @Override
    public int getStrenght() {
        return 0;
    }

    @Override
    public int getDefence() {
        return 0;
    }

    @Override
    public int getIntelligence() {
        return 0;
    }

    @Override
    public int getDextrity() {
        return 0;
    }

    @Override
    public int getAgillity() {
        return 0;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }
}
