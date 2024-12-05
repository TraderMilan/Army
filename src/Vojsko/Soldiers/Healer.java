package Vojsko.Soldiers;


import Vojsko.Commands;

public class Healer extends Soldier implements Commands {

    public final String type = "HEALER";
    public int heal;

    public Healer(String name, int health, int heal) {
        super(name, health);
        this.heal = heal;
    }


    @Override
    public void actionHeals(Army army) {
        System.out.println(name + " heals " + heal + " health to all soldiers ");
        for (Soldier soldier: army.getSoldiers()){
            if (!(soldier instanceof Healer)){
                soldier.setHealth(soldier.getHealth() + 10);
            }
        }
    }

    @Override
    public void report() {
        System.out.println(getTitle() + name + getStatus() + "Type - " + type + " | Health: " + health);
    }
}


