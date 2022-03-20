package com.company;

public class Main {

    public static void main(String[] args) {
        createHeroes();
        for (int i = 0; i < createHeroes(); i++) {
            System.out.println(createHeroes());


        }
	Boss boss = new Boss();
	boss.setHealthBoss(850);
	boss.setDamageBoss(65);
	boss.setTypeOfShield("Magic");
        System.out.println("Health Boss="+boss.getHealthBoss() + ", "+"Damage Boss="
                + boss.getDamageBoss() +", "+"Type of Boss-" + boss.getTypeOfShield());

    //Heroe createHero = new Heroe(450.0,35.0,"Berserk");


    }
    public static int createHeroes (){
        Hero hero1 = new Hero(320,35,"Berserk");
        Hero hero2 = new Hero(505,15);
        Hero hero3 = new Hero(250,40,"x2Damage");
        Hero[] heroes = {hero1, hero2, hero3 };

        return createHeroes();
    }





}
