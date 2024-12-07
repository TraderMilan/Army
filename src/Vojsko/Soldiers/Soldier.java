package Vojsko.Soldiers;


public abstract class Soldier{
    private final String title = "Soldier ";
    private final String status = " here. ";


    protected String name;
    protected int health;

    public Soldier(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getStatus() {
        return status;
    }
    public String getTitle() {
        return title;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void report(Soldier soldier) {
        System.out.print(getTitle() + name + getStatus() + " | Health: " + health + " Type - ");
    }
}


