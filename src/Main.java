import Vojsko.Soldiers.Army;
import Vojsko.Soldiers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Soldier soldier_1 = new SwordMan("SwordMan 1", 100,50);
        Soldier soldier_2 = new SwordMan("SwordMan 2",100, 50);
        Soldier soldier_3 = new SwordMan("SwordMan 3", 100,50);

        Soldier soldier_4 = new Archer("Archer 1", 100,30);
        Soldier soldier_5 = new Archer("Archer 2", 100,30);
        Soldier soldier_6 = new Archer("Archer 3", 100,30);

        Soldier soldier_7 = new Knight("Knight 1", 100,20,40 );
        Soldier soldier_8 = new Knight("Knight 2", 100,20,40 );
        Soldier soldier_9 = new Knight("Knight 3", 100,20,40 );
        Soldier soldier_10 = new Knight("Knight 4", 100,20,40 );

        Soldier soldier_11 = new Healer("Healer", 100,10 );


        List<Soldier> soldiers = new ArrayList<>(List.of(
                soldier_1, soldier_2, soldier_3, soldier_4, soldier_5,
                soldier_6, soldier_7, soldier_8, soldier_9, soldier_10, soldier_11
        ));

        Army army = new Army(soldiers);

        System.out.println("Welcome to my Army...");


        System.out.println("Here are the commands you can use: ");
        System.out.println();
        army.getInstructions();
        System.out.println();

        while (true){
            System.out.println("Type your command... ");

            int cmd = scanner.nextInt();
            army.command(cmd);
            System.out.println();

        }

    }
}