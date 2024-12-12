package Structural.decorator.with;

interface Pizza {
    int getCost();
}

class BasicPizza implements Pizza{
    public int getCost(){
        return 200;
    }
}

class ToppingPizza implements Pizza{
    protected Pizza pizza;

    ToppingPizza(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost();
    }
}


class Cheese extends ToppingPizza {

    Cheese(Pizza pizza) {
        super(pizza);
    }

    public int getCost(){
        return super.getCost()+50;
    }
}

class Olive extends ToppingPizza {

    public Olive(Pizza pizza){
        super(pizza);
    }

    public int getCost(){
        return super.getCost()+50;
    }
}



public class Runner {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new Cheese(pizza);

        System.out.println("Costing of cheese pizza is"+pizza.getCost());

        pizza = new Olive(pizza);
        System.out.println("Costing of cheese olive pizza is" +pizza.getCost());    
    }
}
