package com.company;

import java.util.stream.Stream;

public class Hero {

    private double healthHero;
    private double damageHero;
    private String superPower;

    public double getHealthHero() { return healthHero; }

    public void setHealthHero(double healthHero) { this.healthHero = healthHero; }

    public double getDamageHero() { return damageHero; }

    public void setDamageHero(double damageHero) { this.damageHero = damageHero; }

    public String getSuperPower() { return superPower; }

    public void setSuperPower(String superPower) { this.superPower = superPower; }

    public Hero (double healthHero, double damageHero, String superCapacite){
        this.healthHero = healthHero;
        this.damageHero = damageHero;
        this.superPower = superCapacite;
    }
    public Hero (double healthHero, double damageHero){
        this.healthHero = healthHero;
        this.damageHero =  damageHero;
    }

}
