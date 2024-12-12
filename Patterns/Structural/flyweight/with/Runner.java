package Structural.flyweight.with;


class SoldierType {
    String uniform;
    String weapon;

    SoldierType(String uniform, String weapon) {
        this.uniform = uniform;
        this.weapon = weapon;
    }
}

class Soldier {
    SoldierType type;  // Shared flyweight object
    int health;
    int positionX;
    int positionY;

    Soldier(SoldierType type, int health, int positionX, int positionY) {
        this.type = type;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void printSoliderDetails(){
        System.out.printf("Soldier has uniform: %s weapon: %s health:%s positionx: %s and positiony:: %s %n",type.uniform,type.weapon,health,positionX,positionY);
    }
}
public class Runner {
    public static void main(String[] args) {
        // Only one instance of SoldierType shared between all soldiers
        SoldierType redSoldierType = new SoldierType("Red", "Gun");

        Soldier soldier1 = new Soldier(redSoldierType, 100, 50, 100);
        Soldier soldier2 = new Soldier(redSoldierType, 100, 60, 110);
        // And so on...

        soldier1.printSoliderDetails();
        soldier2.printSoliderDetails();
    }
}
