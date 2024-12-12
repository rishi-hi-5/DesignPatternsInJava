package Creational.Singleton.with;

class CoffeeMachine {
    private static CoffeeMachine instance; // Ek hi instance rahega

    private CoffeeMachine() { // Private constructor
        System.out.println("Coffee Machine ON!");
    }

    public static CoffeeMachine getInstance() { // Ek hi object return karega
        if (instance == null) {
            instance = new CoffeeMachine();
        }
        return instance;
    }

    public void makeCoffee(String type) {
        System.out.println(type + " bana diya!");
    }
}

public class Runner {
    public static void main(String[] args) {
        CoffeeMachine machine1 = CoffeeMachine.getInstance();
        machine1.makeCoffee("Latte");

        CoffeeMachine machine2 = CoffeeMachine.getInstance();
        machine2.makeCoffee("Espresso");

        // Dono employees same machine use kar rahe hain.
    }
}
