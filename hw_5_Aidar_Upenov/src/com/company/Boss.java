package com.company;

public class Boss {
    private double healthBoss;
    private double damageBoss;
    private String typeOfShield;


    public double getHealthBoss(){return  healthBoss;}
    public double getDamageBoss(){return damageBoss;}
    public String getTypeOfShield(){return typeOfShield;}
    public void setHealthBoss(double healthBoss)
    {this.healthBoss=healthBoss;}
    public void setDamageBoss(double damageBoss)
    {this.damageBoss=damageBoss;}
    public void setTypeOfShield(String typeOfShield)
    {this.typeOfShield=typeOfShield;}
}
