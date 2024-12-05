package Vojsko.Soldiers;

import Vojsko.Commands;

public class Archer extends Soldier implements Commands {

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
    public void report() {
        System.out.println(getTitle() + name + getStatus() + "Type - " + type + " | Health: " + health);
    }
}
