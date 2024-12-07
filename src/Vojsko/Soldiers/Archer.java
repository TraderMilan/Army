package Vojsko.Soldiers;

import Vojsko.Commands;
import Vojsko.Defend;

public class Archer extends Soldier implements Defend {

    public final String type = "DEFENSIVE";
    public int protect;

    public Archer(String name, int health, int protect) {
        super(name, health);
        this.protect = protect;
    }

    @Override
    public void actionDefend() {
        System.out.println(name + " protects " + protect + " damage | " + "Health left: " + health );
    }

    @Override
    public void report(Soldier soldier) {
        super.report(soldier);
        System.out.println(type);
    }
}
