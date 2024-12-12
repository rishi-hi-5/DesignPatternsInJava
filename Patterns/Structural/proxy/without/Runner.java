package Structural.proxy.without;


class House {
    void openDoor(String visitor){
        System.out.println(visitor+" has opened the door to enter your house");
    }
}

public class Runner {
    public static void main(String[] args) {
        House house = new House();
        house.openDoor("Family member");
        house.openDoor("Milk man");
        house.openDoor("SalesMan");
        house.openDoor("Thief");
    }
}
