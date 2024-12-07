package Vojsko.Soldiers;

import Vojsko.Attack;

public class SwordMan extends Soldier implements Attack {

    public final String type = "OFFENSIVE";
    private int damage;

    public SwordMan(String name, int health, int damage) {
        super(name, health);
        this.damage = damage;
    }


    @Override
    public void actionAttack() {
        System.out.println(name + " deals " + damage + " damage | " + "Health left: " + health);
    }

    @Override
    public void report(Soldier soldier) {
        super.report(soldier);
        System.out.println(type);
    }
}
