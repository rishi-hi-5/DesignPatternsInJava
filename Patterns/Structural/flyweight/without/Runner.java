package Structural.flyweight.without;

class Soldier {
    String uniform;
    String weapon;
    int health;
    int positionX;
    int positionY;

    Soldier(String uniform, String weapon, int health, int positionX, int positionY) {
        this.uniform = uniform;
        this.weapon = weapon;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void printSoliderDetails(){
        System.out.printf("Soldier has uniform: %s weapon: %s health:%s positionx: %s and positiony:: %s %n",uniform,weapon,health,positionX,positionY);
    }
}

public class Runner {
    public static void main(String[] args) {
        // Same uniform and weapon for every soldier, but still creating separate objects
        Soldier soldier1 = new Soldier("Red", "Gun", 100, 50, 100);
        Soldier soldier2 = new Soldier("Red", "Gun", 100, 60, 110);
        // And so on...

        soldier1.printSoliderDetails();
        soldier2.printSoliderDetails();
    }
}


