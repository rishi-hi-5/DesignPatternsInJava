package Structural.proxy.with;

interface Door {
    void openDoor(String visitor);
}

class House implements Door{
    public void openDoor(String visitor){
        System.out.println(visitor+" has opened the door to enter your house");
    }
}

class HouseProxy implements Door {
    House house;

    public HouseProxy(){
        house = new House();
    }

    @Override
    public void openDoor(String visitor) {
        if(visitor.equals("Family member") || visitor.equals("Milk man")) {
            house.openDoor(visitor);
        } else{
            System.out.println(visitor+" are not allowed to enter the house");
        }
    }
}


public class Runner {
    public static void main(String[] args) {
        HouseProxy house = new HouseProxy();
        house.openDoor("Family member");
        house.openDoor("Milk man");
        house.openDoor("SalesMan");
        house.openDoor("Thief");
    }
}
