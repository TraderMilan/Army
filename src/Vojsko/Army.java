package Vojsko;

import Vojsko.Soldiers.*;

import java.util.List;

public class Army implements Commands {
    private List<Soldier> soldiers;

    public Army(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public void getInstructions() {
        System.out.println("Select '1' to see all of our soldiers");
        System.out.println("Select '2' for Defend");
        System.out.println("Select '3' for Attack");
        System.out.println("Select '4' to Heal the Army");
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }


    @Override
    public void command(int x) {
        if (x == 1) {
            System.out.println("-----------REPORT-----------");
            for (Soldier soldier : soldiers) {
              soldier.report(soldier);
            }

        } else if (x == 2) {
            System.out.println("-----------DEFEND-----------");
            for (Soldier soldier : soldiers) {
                if (soldier instanceof Defend ) {
                    ((Defend) soldier).actionDefend();
                }
            }
        } else if (x == 3) {
            System.out.println("-----------ATTACK-----------");
            for (Soldier soldier : soldiers) {
                if (soldier instanceof Attack) {
                    ((Attack) soldier).actionAttack();
                }
            }
        }else if (x == 4) {
            System.out.println("-----------HEAL-----------");
            for (Soldier soldier : soldiers){
                if (soldier instanceof Heal) {
                    ((Heal) soldier).actionHeals(this);
                }
            }

            System.out.println("All soldiers have been successfully healed. ");
        } else {
            System.out.println("Unknown command... Try again: ");
        }

    }
}
