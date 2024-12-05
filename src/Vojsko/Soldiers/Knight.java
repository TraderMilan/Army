package Vojsko.Soldiers;

import Vojsko.Commands;

public class Knight extends Soldier implements Commands {

    public final String type = "ADAPTABLE";
    public int protect;
    public int damage;

    public Knight(String name, int health, int protect, int damage) {
        super(name, health);
        this.protect = protect;
        this.damage = damage;
    }


    @Override
    public void actionAttack() {
        System.out.println(name + " deals " + damage + " damage | " + "Health left: " + health);
    }

    @Override
    public void actionDefend() {
        System.out.println(name + " protects " + protect + " damage | " + "Health left: " + health);
    }

    @Override
    public void report() {
        System.out.println(getTitle() + name + getStatus() + "Type - " + type + " | Health: " + health);
    }
}
