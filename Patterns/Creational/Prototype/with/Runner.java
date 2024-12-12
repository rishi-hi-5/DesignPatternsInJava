package Creational.Prototype.with;

class Villager implements Cloneable{
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

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public Villager clone() {
        try {
            Villager clone = (Villager) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

public class Runner {

    public static void main(String[] args) {
        Villager villagerWithAxe = new Villager(75, 100, "Axe");
        Villager villagerWithBowAndArrow = villagerWithAxe.clone();
        villagerWithBowAndArrow.setWeapon("BowAndArrow");

        System.out.println(villagerWithAxe);
        System.out.println(villagerWithBowAndArrow);
    }
}