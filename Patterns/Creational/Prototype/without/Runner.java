package Creational.Prototype.without;

class Villager {
    private int strength;
    private int health;
    private String weapon;

    public Villager(int strength,int health,String weapon){
        this.health = health;
        this.strength = strength;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Villager strength "+strength + " health "+health + " weapon "+weapon ;
    }
}

public class Runner {

    public static void main(String[] args) {
        Villager villagerWithAxe = new Villager(75, 100, "Axe");
        Villager villagerWithBowAndArrow = new Villager(75, 100, "BowAndArrow");

        System.out.println(villagerWithAxe);
        System.out.println(villagerWithBowAndArrow);
    }
}
