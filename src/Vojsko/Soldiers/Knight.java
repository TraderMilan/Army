package Vojsko.Soldiers;

import Vojsko.Attack;
import Vojsko.Commands;
import Vojsko.Defend;

public class Knight extends Soldier implements Attack, Defend {

    public final String type = "ADAPTABLE";
    public int protect;
    public int damage;

    public Knight(String name, int health, int protect, int damage) {
        super(name, health);
        this.protect = protect;
        this.damage = damage;
    }

    @Override
    public void report(Soldier soldier) {
        super.report(soldier);
        System.out.println(type);
    }

    @Override
    public void actionAttack() {
        System.out.println(name + " deals " + damage + " damage | " + "Health left: " + health);
    }

    @Override
    public void actionDefend() {
        System.out.println(name + " protects " + protect + " damage | " + "Health left: " + health);
    }

}
