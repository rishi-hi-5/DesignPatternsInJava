package Structural.decorator.without;

class BasicPizza {
    public int getCost(){
        return 200;
    }
}


class CheesePizza extends BasicPizza {
    public int getCost(){
        return super.getCost()+50;
    }
}

class OlivePizza extends BasicPizza{
    public int getCost(){
        return super.getCost()+50;
    }
}

class CheeseOlivePizza extends BasicPizza{
    public int getCost(){
        return super.getCost()+100;
    }
}


public class Runner {
    public static void main(String[] args) {
        CheesePizza cheesePizza = new CheesePizza();
        CheeseOlivePizza cheeseOlivePizza = new CheeseOlivePizza();

        System.out.println("Costing of cheese pizza is" +cheesePizza.getCost());
        System.out.println("Costing of cheese olive pizza is" +cheeseOlivePizza.getCost());
    }
}
