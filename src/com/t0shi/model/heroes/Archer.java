package com.t0shi.model.heroes;

public class Archer implements ICanBeHero{

    private String name;

    private int strenght;
    private int defence;
    private int intelligence;
    private int dextrity;
    private int agillity;
    private int speed;

    @Override
    public int getStrenght() {
        return strenght;
    }

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public int getDextrity() {
        return dextrity;
    }

    @Override
    public int getAgillity() {
        return agillity;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getName() {
        return getName();
    }

    @Override
    public void setName(String name) {
    }
}
