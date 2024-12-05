package Vojsko.Soldiers;

import Vojsko.Commands;

public class SwordMan extends Soldier implements Commands {

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
    public void report() {
        System.out.println(getTitle() + name + getStatus() + "Type - " + type + " | Health: " + health);
    }
}
