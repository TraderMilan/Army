package Vojsko.Soldiers;


import Vojsko.Army;
import Vojsko.Commands;
import Vojsko.Heal;

public class Healer extends Soldier implements Heal {

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
    public void report(Soldier soldier) {
        super.report(soldier);
        System.out.println(type);
    }


}


