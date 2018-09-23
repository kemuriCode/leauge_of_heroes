package com.t0shi;

import com.t0shi.model.heroes.Archer;
import com.t0shi.model.heroes.Knight;
import com.t0shi.model.heroes.Mage;

public class Main {

    public static void main(String[] args) {
        Mage mage = new Mage();
        mage.setName("Gandalf");
        printoutHero(mage);
    }

    static void printoutHero(Mage hero) {
        System.out.println("---------------------------------------------------------");
        System.out.println(hero.getName()+"\t|"
                + "str: "+hero.getStrenght() +"\t|"
                + "def: "+hero.getDefence() +"\t|"
                + "int: "+hero.getIntelligence() +"\t|"
                + "agi: "+hero.getAgillity() +"\t|"
                + "spd: "+hero.getSpeed() +"\t|"
                + "dex: "+hero.getDextrity() +"\t|");
        System.out.println("---------------------------------------------------------");

    }

    static void printoutHero(Knight hero) {
        System.out.println("-------------------------------------------------");
        System.out.println(hero.getName()+"\t|"
                + "str: "+hero.getStrenght() +"\t|"
                + "def: "+hero.getDefence() +"\t|"
                + "int: "+hero.getIntelligence() +"\t|"
                + "agi: "+hero.getAgillity() +"\t|"
                + "dex: "+hero.getSpeed() +"\t|");
        System.out.println("-------------------------------------------------");

    }
    static void printoutHero(Archer hero) {
        System.out.println("-------------------------------------------------");
        System.out.println(hero.getName()+"\t|"
                + "str: "+hero.getStrenght() +"\t|"
                + "def: "+hero.getDefence() +"\t|"
                + "int: "+hero.getIntelligence() +"\t|"
                + "agi: "+hero.getAgillity() +"\t|"
                + "dex: "+hero.getSpeed() +"\t|");
        System.out.println("-------------------------------------------------");

    }
}
