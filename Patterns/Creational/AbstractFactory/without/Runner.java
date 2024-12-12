package Creational.AbstractFactory.without;


class FurnitureShop {
    void displayFurniture(String theme){
        if(theme.equals("Modern")) {
            System.out.println("Display Modern Sofa");
            System.out.println("Display Modern Chair");
        } else if(theme.equals("Victorian")) {
            System.out.println("Display Victorian Sofa");
            System.out.println("Display Victorian Chair");
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.displayFurniture("Modern");

        furnitureShop.displayFurniture("Victorian");
    }
}