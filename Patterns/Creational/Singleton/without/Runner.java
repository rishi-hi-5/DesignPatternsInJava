package Creational.Singleton.without;
class CoffeeMachine {
    // Constructor is public, so a new instance can be created every time
    public CoffeeMachine() {
        System.out.println("New Coffee Machine Created!");
    }

    public void makeCoffee(String type) {
        System.out.println(type + " bana diya!");
    }
}

public class Runner {
    public static void main(String[] args) {
        // Each employee creates a new coffee machine
        CoffeeMachine machine1 = new CoffeeMachine();
        machine1.makeCoffee("Latte");

        CoffeeMachine machine2 = new CoffeeMachine();
        machine2.makeCoffee("Espresso");

        CoffeeMachine machine3 = new CoffeeMachine();
        machine3.makeCoffee("Cappuccino");

        // Every employee ends up with a separate coffee machine
    }
}
