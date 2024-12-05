package Vojsko;

import Vojsko.Soldiers.Army;
import Vojsko.Soldiers.Soldier;

public interface Commands {

    default void actionAttack(){

    }
    default void actionDefend(){

    }
    default void actionHeals(Army army){

    }


    default void command(int x){

    }

    default void report(){

    }

}
